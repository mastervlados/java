import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_4 {

// Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public static void main(String[] args) {
    Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
    Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
    // result [6,6,0,1]
    System.out.println(sum(d1, d2));

    Deque<Integer> d3 = new ArrayDeque<>(Arrays.asList(9,6,9,3));
    Deque<Integer> d4 = new ArrayDeque<>(Arrays.asList(5,8,3,4));
    // 14 = 4,1; 14 = 4,1; 12 = 2,1; 7 
    // result [4, 1, 4, 1, 2, 1, 7]
    System.out.println(sum(d3, d4));
}


public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
    
    Deque<Integer> deque = new ArrayDeque<Integer>();
    String result = new String();

    int d1EqualD2Length = d1.size();

    // for (int i = 0; i < d1EqualD2Length; i++) {
    //     result += String.format("%d", d1.pollLast() + d2.pollLast());
    // }

    for (int i = 0; i < d1EqualD2Length; i++) {
        int sumTwoNumbers = d1.pollLast() + d2.pollLast();
        int parseNumberValue = (int)sumTwoNumbers / 10;
        // System.out.println(parseNumberValue);
        int parseNumberFloat = (int)sumTwoNumbers % 10;
        // System.out.println(parseNumberFloat);
        if (parseNumberValue != 0) {
            deque.push(parseNumberValue);
            deque.push(parseNumberFloat);
        } else {
            deque.push(sumTwoNumbers);
        }
    }

    // for (int i = result.length() - 1; i >= 0; i--) {
    //     deque.push(Character.getNumericValue(result.charAt(i)));
    // }
    // return new ArrayDeque<>();
    return deque;
}
}