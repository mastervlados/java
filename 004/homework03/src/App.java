import java.util.Scanner;

import classes.Person;
import classes.TxtWriter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        boolean isCorrect = false;
        System.out.println("This program helps you add new contacts and save it in your local txt files.");
        System.out.println("Each contact contains:");
        System.out.println("1. FCs           | sepatated with spaces between");
        System.out.println("2. Birthday      | have to be like <dd.mm.yyyy> format");
        System.out.println("3. Phone number  | just numbers like <89007773344>");
        System.out.println("4. Gender        | use short labels: <f> - female, <m> means male");
        System.out.println("You can finish entering new contact and continue to enter another one!");

        while (!isCorrect) {
            try {
                System.out.print("> Type next each element separate with a space: ");
                Person person = new Person(iScanner.nextLine());
                TxtWriter writer = new TxtWriter();
                writer.writeContact(person);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            } catch (Error er) {
                System.err.println(er.getMessage());
            } finally {
                System.out.print("> Continue? [Y/n]: ");
                String answer = iScanner.nextLine();
                if (!answer.equalsIgnoreCase("y")) {
                    isCorrect = true;
                }   
            }
        }
        
    }
}
