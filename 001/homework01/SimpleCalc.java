// Task_3.
// Реализовать простой калькулятор (+,-,=,*), 
// только с целыми числами.
import java.util.Scanner;

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

        switch (operation) {
        case 1: 
            result = getSumOfTwoNumbers(firstNumber, secondNumber); 
            System.out.printf("%d + %d = %d", firstNumber, secondNumber, result);
            break;
        case 2: 
            result = getDiffOfTwoNumbers(firstNumber, secondNumber); 
            System.out.printf("%d - %d = %d", firstNumber, secondNumber, result);
            break;
        case 3: 
            result = getProductOfTwoNumbers(firstNumber, secondNumber); 
            System.out.printf("%d * %d = %d", firstNumber, secondNumber, result);
            break;
        case 4: 
            result = getLogicComparisonOfTwoNumbers(firstNumber, secondNumber); 
            System.out.printf("%d = %d ? %b", firstNumber, secondNumber, result);
            break;
        default: 
            System.out.println(" Closing Application ");
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