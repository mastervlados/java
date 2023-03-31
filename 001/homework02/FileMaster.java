import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileMaster {

    // Напишите программу, которая
    // 1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла
    // 2) изменяет строковое содержимое файла подставляя по маске "%s" ваше имя
    // 3) сохраняет файл локально
    // 4) читает сохраненный файл и выводит содержимое в логгер
    // 5) удаляет сохраненный файл
    public static void main(String[] args) {
        String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";
        String fileName = "local.txt";
        String content = download(fileUrl, fileName);
        String contentWithUserName = change("Владислав", content);
        saveOnLocal(fileName, contentWithUserName);
        read(fileName);
        if (removeFromLocale(fileName)) {
            System.out.printf("File: %s was deleted.", fileName);
        } else {
            System.out.printf("Error: %s is not exist.", fileName);
        }
    }
    
    public static String download(String url, String localFilename) {
        try {
            URL address = new URL(url);
            HttpURLConnection http = (HttpURLConnection)address.openConnection();
            // Get file size
            double fileSize = (double)http.getContentLengthLong();
            BufferedInputStream in = new BufferedInputStream(http.getInputStream());
            FileOutputStream fos = new FileOutputStream(localFilename);
            BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
            byte[] buffer = new byte[1024];
            double downloaded = 0.00D;
            double percentDownloaded = 0.00D;
            int read = 0;

            while ((read = in.read(buffer, 0, 1024)) >= 0) {
                bos.write(buffer, 0, read);
                downloaded += read;
                percentDownloaded = (downloaded * 100) / fileSize;
                // Represent total percent of process downloading
                System.out.printf("Downloaging.. %.4f%% of a file.\n", percentDownloaded);
            }

            
            // Close
            bos.close();
            in.close();
            System.out.println("Download complete.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get And Return File Data (String)
        String data = getFileDataAsString(localFilename);
        // System.out.println(data);

        return data;
    }

    public static String getFileDataAsString(String localFilename) {
        String data = new String();

        try {
            String pathProject = System.getProperty("user.dir");
            String fileInDir = String.format("/%s", localFilename);
            String pathFile = pathProject.concat(fileInDir);
            StringBuffer fileData = new StringBuffer();
            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
            char[] buf = new char[1024];
            int numRead = 0;
            while((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
            }
            reader.close();
            data = fileData.toString();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return data;
        }
    }

    public static String change(String name, String fileContent) {
        String newFileData = String.format(fileContent, name); 
        // System.out.println(newFileData);
        return newFileData;
    }
    
    public static void read(String localFilename){
        String data = getFileDataAsString(localFilename);
        System.out.println(data);
    }
    
    public static void saveOnLocal(String fileName, String fileContent) {
        try {
            File pickFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(pickFile, false);    // true to append
                                                                             // false to overwrite.
            byte[] bytes = fileContent.getBytes();
            fos.write(bytes);
            System.out.printf("File: %s update successfully.\n", fileName);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean removeFromLocale(String fileName) {
        boolean answer = false;
        File deleteFile = new File(fileName);
        if (deleteFile.delete()) {
            answer = true;
        }
        return answer;
    }
}