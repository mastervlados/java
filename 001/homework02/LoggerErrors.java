import java.util.logging.*;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class LoggerErrors {

    //Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
    //Требуется перехватить все возможные ошибки и вывести их в логгер.
    //После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/result.txt");
        String response = new String(); 
        // Checks for file
        try {
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("New file created!");
            } else {
                System.out.println("Necessary file existed!");
            }
        } catch (Exception e) {
            System.out.println("BOOM!");
            e.printStackTrace();
        }

        // Inits logger
        Logger logger = Logger.getLogger(LoggerErrors.class.getName());
        
        FileHandler fh;
        try {
            fh = new FileHandler(pathFile, true); // add new lines mode
            logger.addHandler(fh);
            // To turn off the console handler:
            logger.setUseParentHandlers(false);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
        } catch (Exception e) {
            System.out.println("BOOM!");
            e.printStackTrace();
        }

        // Suggests input
        Scanner iScanner = new Scanner(System.in);
        try {
            byte data = iScanner.nextByte();
            response = String.format("Add %b", data);
            logger.info(response);
        } catch (Exception e) {
            response = "BOOM! " + e.getMessage();
            logger.info(response);
            // LoggerErrors.java:52: error: cannot find symbol
            //         logger.error(response);
            //               ^
            //     symbol:   method error(String)
            //     location: variable logger of type Logger
            // 1 error
            // error: compilation failed
        }
    }
}