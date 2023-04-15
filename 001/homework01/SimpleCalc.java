// Task_3.
// Реализовать простой калькулятор (+,-,=,*), 
// только с целыми числами.
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;
import java.io.File;

class SimpleCalc {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Simple Calc!\n");
        
        int result = 0;

        System.out.println("Please enter two numbers");
        int firstNumber = getNumberSuggestInput("number a");
        int secondNumber = getNumberSuggestInput("number b");
        System.out.println("Select an operation by number:");
        System.out.println("+-----------+----------+----------+");
        System.out.println("| 1 to \"+\"  | 2 to \"-\" | 3 to \"*\" |");
        System.out.println("| 4 to \"?=\" |          | 0 to exit|");
        System.out.println("+-----------+----------+----------+");
        int operation = getNumberSuggestInput("number of operation");
        String answer = new String();

        // Init Logger
        Logger logger = Logger.getLogger(SimpleCalc.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        // logger.addHandler(ch);
        
        FileHandler fh;
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/log.xml");
            // From the FileHandlerconstructor, 
            // you can specify a boolean to specify an append mode.
            fh = new FileHandler(pathFile, true); // add new lines
            logger.addHandler(fh);
            // To remove the console handler:
            logger.setUseParentHandlers(false);
            // SimpleFormatter sFormat = new SimpleFormatter();
            // ch.setFormatter(sFormat);
            XMLFormatter xml = new XMLFormatter();
            // ! ch.setFormatter(xml);
            fh.setFormatter(xml);
        } catch (Exception e) {
            System.out.println("BOOM!");
            e.printStackTrace();
        }

        switch (operation) {
        case 1: 
            result = getSumOfTwoNumbers(firstNumber, secondNumber);
            answer = String.format("%d + %d = %d", firstNumber, secondNumber, result);
            System.out.println(answer);
            logger.info(answer);
            break;
        case 2: 
            result = getDiffOfTwoNumbers(firstNumber, secondNumber); 
            answer = String.format("%d - %d = %d", firstNumber, secondNumber, result);
            System.out.println(answer);
            logger.info(answer);
            break;
        case 3: 
            result = getProductOfTwoNumbers(firstNumber, secondNumber); 
            answer = String.format("%d * %d = %d", firstNumber, secondNumber, result);
            System.out.println(answer);
            logger.info(answer);
            break;
        case 4: 
            result = getLogicComparisonOfTwoNumbers(firstNumber, secondNumber); 
            answer = String.format("%d = %d ? %b", firstNumber, secondNumber, result);
            System.out.println(answer);
            logger.info(answer);
            break;
        default: 
            answer = " Closing Application ";
            System.out.println(answer);
            logger.info(answer);
            break;
        }
    }

    public static int getNumberSuggestInput(String label) {
        Scanner iScanner = new Scanner(System.in);
        int number = -1;
        
        System.out.printf("Enter %s: ", label);
        
        while (!iScanner.hasNextInt()) {
            iScanner.next();
            System.out.print("Only numbers allowed. Try again: ");
        }

        number = iScanner.nextInt();

        System.out.printf("%s = %d\n", label, number);
        return number;
    }

    public static int getSumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int getDiffOfTwoNumbers(int a, int b) {
        return a - b;
    }

    public static int getProductOfTwoNumbers(int a, int b) {
        return a * b;
    }
    
    public static int getLogicComparisonOfTwoNumbers(int a, int b) {
        if (a == b) return 1;
        return 0;
    }
}