import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class IsPalendrom {

// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public static void main(String[] args) {
    Deque<Integer> dequeFirst = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
    System.out.println(checkOn(dequeFirst));
    Deque<Integer> dequeSecond = new ArrayDeque<>(Arrays.asList(1,3,3,7,7,3,3,1));
    System.out.println(checkOn(dequeSecond));
    Deque<Integer> dequeThird = new ArrayDeque<>(Arrays.asList(1,3,5,3,1));
    System.out.println(checkOn(dequeThird));
    Deque<Integer> dequeFourth = new ArrayDeque<>(Arrays.asList(1,5,5,3,1));
    System.out.println(checkOn(dequeFourth));
}


public static boolean checkOn(Deque<Integer> deque){
    int middleDequeLength = (int)deque.size() / 2;

    for (int i = 0; i < middleDequeLength; i++) {
        int nextHeadNumber = deque.pollFirst();
        int nextTailNumber = deque.pollLast();
        if (nextHeadNumber != nextTailNumber) {
            return false;
        }
    }
    return true;
}
}