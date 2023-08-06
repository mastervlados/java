package classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TxtWriter {
    public String filePath;

    public void writeContact(Person person) {
        checkOrCreateFile(person.getLastName());
        try {
            String contact = String.format("%s %s %s %s %d %c \n", 
            person.getLastName(), 
            person.getFirstName(), 
            person.getPatronymic(), 
            person.getBirthday(), 
            person.getPhoneNumber(), 
            person.getGender());
            Files.write(Paths.get(this.filePath), contact.getBytes(), StandardOpenOption.APPEND);
        }
        catch(IOException e){
            System.out.println("Writer > BOOM!");
            e.printStackTrace();
        } 
    }

    private void checkOrCreateFile(String fileName) {
        String localPath = this.getClass().getResource("").getPath();
        String pathFile = localPath.concat("files/"+fileName+".txt");
        pathFile = pathFile.substring(1);
        // System.out.println(pathFile);
         try {
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("Writer > New file created!");
            } else {
                System.out.println("Writer > Necessary file existed!");
            }
        } catch (IOException e) {
            System.out.println("Writer > BOOM!");
            e.printStackTrace();
        }
        this.filePath = pathFile;
    }
}
