package gb.homework;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> firstList = List.of(5, 6, 7, 8, 9, 0, 15);
        List<Integer> secondList = List.of(10, 11, 16, 34);
        ListOfNumericalSequence firstNumericalSequence = new ListOfNumericalSequence(firstList);
        ListOfNumericalSequence secondNumericalSequence = new ListOfNumericalSequence(secondList);
        OperationWithListOfNumericalSequence.compareAndGetResultMessageOfTwoLists(firstNumericalSequence, secondNumericalSequence);
    }
}