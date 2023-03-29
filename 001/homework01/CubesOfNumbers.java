// Немного информации по массивам
// https://metanit.com/java/tutorial/2.4.php

// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
// Затем вводятся 2 числа из этого диапазона. 
// Используя данные из массива найдите их кубы.

// Sample Input:
// 8
// 11

// Sample Output:
// 512
// 1331
import java.util.Scanner;

class CubesOfNumbers {
    public static void main(String[] args) {
        int numbers[] = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)Math.pow(i + 1, 3);
        }

        int firstNumber = getNumberSuggestInput("1st");
        int secondNumber = getNumberSuggestInput("2nd");

        // Output result !number -1 to get right index
        System.out.println();
        System.out.printf("%d^3 = %d\n%d^3 = %d", firstNumber, numbers[firstNumber - 1], secondNumber, numbers[secondNumber - 1]);
    }

    public static int getNumberSuggestInput(String label) {
        Scanner iScanner = new Scanner(System.in);
        boolean isCorrect = false;
        int number = -1;
        
        System.out.printf("Enter %s number: ", label);
        
        while (!isCorrect) {
            if (iScanner.hasNextInt()) {
                number = iScanner.nextInt();
                if (number >= 1 && number <= 1000) {
                    isCorrect = true;
                } else {
                    System.out.print("Only numbers between 1 and 1000 allowed. Try again: ");
                }
            } else {
                iScanner.next();
                System.out.print("Only numbers allowed. Try again: ");
            }
        }
        System.out.printf("%s number = %d\n", label, number);
        return number;
    }
}