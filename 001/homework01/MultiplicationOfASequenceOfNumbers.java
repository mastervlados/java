// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа. 
// Выведите на экран результат умножения построчно.

// Sample Input:
// 4 = dimension
// 1
// 2
// 3
// 5
// 2 = multiplier

// Sample Output:
// 2
// 4
// 6
// 10
import java.util.Scanner;

class MultiplicationOfASequenceOfNumbers {
    public static void main(String[] args) {
        int dimension = getNumberSuggestInput("dimension");
        int numbers[] = new int[dimension];
        int numbersLength = numbers.length;

        // Fill array:
        for (int i = 0; i < numbersLength; i++) {
            numbers[i] = getNumberSuggestInput(Integer.toString(i + 1) + " number");
        }
        int multiplier = getNumberSuggestInput("multiplier");

        // Input data:
        System.out.println(); // Space between
        System.out.println("Input:");
        System.out.println(Integer.toString(dimension));
        for (int j = 0; j < numbersLength; j++) {
            System.out.println(Integer.toString(numbers[j]));
        }
        System.out.println(Integer.toString(multiplier));

        // Output data:
        System.out.println(); // Space between
        System.out.println("Output:");
        for (int k = 0; k < numbersLength; k++) {
            System.out.println(Integer.toString(numbers[k] * multiplier));
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
        
}