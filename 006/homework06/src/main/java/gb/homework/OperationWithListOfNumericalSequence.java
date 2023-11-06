package gb.homework;

import gb.homework.ListOfNumericalSequence;
import gb.homework.ListOfNumericalSequenceComparator;

import java.util.ArrayList;
import java.util.List;

public class OperationWithListOfNumericalSequence {
    public static Integer getAverageValueFromListOfNumericalSequence(ListOfNumericalSequence list) {
        Integer sumOfElements = 0;
        List<Integer> sequence = new ArrayList<>(list.getSequence());

        for (Integer number : sequence) {
            sumOfElements += number;
        }

        try {
            return (Integer)sumOfElements / sequence.size();
        } catch (ArithmeticException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    public static int compareAndGetResultMessageOfTwoLists(ListOfNumericalSequence firtsList, ListOfNumericalSequence secondList) {
        ListOfNumericalSequenceComparator<ListOfNumericalSequence> comparator = new ListOfNumericalSequenceComparator<>();
        return comparator.compare(firtsList, secondList);
    }
}
