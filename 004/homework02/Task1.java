package homework02;

import java.util.Scanner;

public class Task1 {
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
    // Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void main(String[] args) {
        System.out.println(suggestInputFloat());
    }

    public static float suggestInputFloat() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;
        float number = -1.0f;

        System.out.print("Type a float number: ");
        while (!isCorrect) {
            if (scanner.hasNextFloat()) {
                number = scanner.nextFloat();
                isCorrect = true;
            } else {
                scanner.next();
                System.out.print("Only froat-numbers allowed. Try again: ");
            }
        }
        return number;
    }
}
