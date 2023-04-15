// 1. Реализовать алгоритм сортировки слиянием и выборкой.
import java.util.*;

public class SortMaster {

    public static void main(String[] args) {
        Random random = new Random();
        int dimension = random.nextInt(5, 20);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < dimension; i++) {
            list.add(random.nextInt(1, 100)); 
        }

        System.out.println("Before:");
        System.out.println(list);
        System.out.println();
        System.out.println("Quick Sort:");
        System.out.println(quickSort(list));
        System.out.println();
        System.out.println("Merge Sort:");
        mergeSort(list);
        System.out.println(list);
    }

    public static List<Integer> quickSort(List<Integer> list) {
        int listLength = list.size();
        if (listLength <= 1) {
            return list;
        } else {
            int pivot = list.get(0);
            List<Integer> lessThanPivot = new ArrayList<Integer>();
            List<Integer> greaterThanPivot = new ArrayList<Integer>();
            for (Integer element : list.subList(1, listLength)) {
                if (element <= pivot) {
                    lessThanPivot.add(element);
                } else {
                    greaterThanPivot.add(element);
                }
            }
            List<Integer> merge = new ArrayList<Integer>();
            merge.addAll(quickSort(lessThanPivot));
            merge.add(pivot);
            merge.addAll(quickSort(greaterThanPivot));

            return merge;
        }
    }

    public static void mergeSort(List<Integer> list) {
        int listLength = list.size();
        if (listLength > 1) {
            int mid = listLength / 2;
            List<Integer> left = new ArrayList<Integer>();
            left.addAll(list.subList(0, mid));
            List<Integer> right = new ArrayList<Integer>();
            right.addAll(list.subList(mid, listLength));
            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while ((i < left.size()) && (j < right.size())) {
                if (left.get(i) < right.get(j)) {
                    list.set(k, left.get(i));
                    i++;
                } else {
                    list.set(k, right.get(j));
                    j++;
                }
                k++;
            }

            while (i < left.size()) {
                list.set(k, left.get(i));
                i++;
                k++;
            }

            while (j < right.size()) {
                list.set(k, right.get(j));
                j++;
                k++;
            }
        }
    }
}