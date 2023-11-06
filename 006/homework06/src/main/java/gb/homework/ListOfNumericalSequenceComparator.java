package gb.homework;

import java.util.Comparator;

public class ListOfNumericalSequenceComparator<T extends ListOfNumericalSequence> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        Integer averageValueFirstList = OperationWithListOfNumericalSequence.getAverageValueFromListOfNumericalSequence(o1);
        Integer averageValueSecondList = OperationWithListOfNumericalSequence.getAverageValueFromListOfNumericalSequence(o2);
        if (averageValueFirstList > averageValueSecondList) {
            System.out.printf("First List has %d average value that more than the Second List (%d)\n", averageValueFirstList, averageValueSecondList);
            return 1;
        } else if (averageValueSecondList > averageValueFirstList) {
            System.out.printf("Second List has %d average value that less than the First List (%d)\n", averageValueFirstList, averageValueSecondList);
            return 0;
        }
        System.out.println("Average values of both of Lists are equal!");
        return -1;
    }

}
