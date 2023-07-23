import java.util.LinkedList;

public class Reverse {
    // Необходимо реализовать метод разворота связного списка
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        // O(n)
        reverseMethod(numbers);
        System.out.println(numbers);
        reverseMethod(numbers);
        System.out.println(numbers);
    }

    private static <T> void reverseMethod(LinkedList<T> list) {
        // Remember size of the list
        int listSize = list.size();
        // Make a copy of the list
        LinkedList<T> alt = new LinkedList<T>(list);

        for (int j = 0; j < listSize; j++) {
            // Take and remove the last one element from alt list
            T element = alt.pollLast();
            // Remove first element from the target list
            list.removeFirst();
            // Add new element to the end of target list
            list.add(element);
        }
    }

}
