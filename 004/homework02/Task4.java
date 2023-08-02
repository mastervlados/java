package homework02;

import java.util.Scanner;

public class Task4 {
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) {
        System.out.println(suggestInputTerm());
    }

    public static String suggestInputTerm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type any message: ");
        String message = scanner.nextLine();
        if (message.trim().length() == 0) {
            throw new RuntimeException("| Message must contain smth.");
        }
        return message;
    }
}
