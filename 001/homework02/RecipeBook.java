// На первой строке записывается натуральное число n - количество строчек в книге. 
// Затем вводится n строк - строки книги. 
// потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. 
// Потом вводится m строк - вида "продукт1 - продукт2", 
// где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, 
// на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. 
// название продуктов написаны строчными буквами. 
// Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. 
// ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

// Sample Input:
// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:

// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
import java.util.Scanner;

public class RecipeBook {

    public static void main(String[] args) {
        // get uder data
        int countOfBookLines = getNumberSuggestInput("count of book lines");
        String[] bookLines = new String[countOfBookLines];
        bookLines = fillArray(bookLines);
        int countOfProductsCauseAllergies = getNumberSuggestInput("count of products cause allergies");
        String[] productsAndAllergies = new String[countOfProductsCauseAllergies];
        productsAndAllergies = fillArray(productsAndAllergies);
        
        // String[] bookLines = {
        //     "Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.", 
        //     "Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни."
        // };
        // String[] productsAndAllergies = {
        //     "арахис - колбаса", 
        //     "клубника - вишня",            
        //     "сгущенка - молоко"
        // };
        printRecipeBook(bookLines, productsAndAllergies);

    }

    public static void printRecipeBook(String[] lines, String[] exceptions) {
        for (String line : lines) {
            String recipeLine = line;
            for (String allergy : exceptions) {
                String[] excepts = allergy.split(" - ");
                // Replace firstly
                recipeLine = recipeLine.replaceAll(excepts[0], excepts[1]);
                excepts[0] = String.format("%s%s", excepts[0].substring(0, 1).toUpperCase(), excepts[0].substring(1));
                excepts[1] = String.format("%s%s", excepts[1].substring(0, 1).toUpperCase(), excepts[1].substring(1));
                // Replace secondly (with UpperCase)
                recipeLine = recipeLine.replaceAll(excepts[0], excepts[1]);
            }
            System.out.println(recipeLine);
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

    public static String[] fillArray(String[] array) {
        Scanner iScanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter %d term: ", i + 1);
            array[i] = iScanner.nextLine();
        }
        return array;
    }
}