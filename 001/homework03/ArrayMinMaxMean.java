// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
import java.util.*;

public class ArrayMinMaxMean {

    public static void main(String[] args) {
        Random random = new Random();
        int dimension = random.nextInt(5, 20);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < dimension; i++) {
            arrayList.add(random.nextInt(1, 100)); 
        }

        System.out.println(arrayList);

        int mean = 0;
        int maxElement = -1;
        int minElement = -1;
        int arrayListLength = arrayList.size();
        if (arrayListLength >= 2) {
            if (arrayList.get(0) > arrayList.get(1)) {
                maxElement = (int)arrayList.get(0);
                minElement = (int)arrayList.get(1);
            } else {
                maxElement = (int)arrayList.get(1);
                minElement = (int)arrayList.get(0);               
            }
            for (Integer number : arrayList) {
                mean += number;
                if (maxElement < number) {
                    maxElement = (int)number;
                } else if (number < minElement) {
                    minElement = (int)number;
                }
            }
        } else {
            System.out.println("Error");
        }
        System.out.println();
        System.out.printf("Max: %d\n", maxElement);
        System.out.printf("Min: %d\n", minElement);
        System.out.printf("Average: %.2f", (float)mean / arrayListLength);
    }
}