// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.*;

public class TestIterator {

        public static void main(String[] args) {
                Random random = new Random();
                int dimension = random.nextInt(5, 20);
                List<Integer> list = new ArrayList<Integer>();
                for (int i = 0; i < dimension; i++) {
                        list.add(random.nextInt(1, 100)); 
                }
                Iterator<Integer> col = list.iterator();
                while (col.hasNext()) {
                        // System.out.println(col.next());
                        if (col.next() % 2 == 0) {
                                col.remove();
                        }
                }
                // Print List
                System.out.println(list);
        }
}