package gb.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OperationWithListOfNumericalSequenceTest {
    ListOfNumericalSequence firstList;
    ListOfNumericalSequence secondList;
    ListOfNumericalSequence thirdList;
    ListOfNumericalSequence fourthList;
    ListOfNumericalSequence exceptionList;
    @BeforeEach
    void setUp() {
        this.firstList = new ListOfNumericalSequence(List.of(1, 2, 3)); // 2
        this.secondList = new ListOfNumericalSequence(List.of(3, 2, 1)); // 2
        this.thirdList = new ListOfNumericalSequence(List.of(4, 5, 6)); // 5
        this.fourthList = new ListOfNumericalSequence(List.of(3, 2, 4)); // 3
        this.exceptionList = new ListOfNumericalSequence(List.of()); // 0
    }

    @Test
    void getAverageValueFromListOfNumericalSequence() {
        assertEquals(2, OperationWithListOfNumericalSequence.getAverageValueFromListOfNumericalSequence(this.firstList));
        assertEquals(2, OperationWithListOfNumericalSequence.getAverageValueFromListOfNumericalSequence(this.secondList));
        assertEquals(5, OperationWithListOfNumericalSequence.getAverageValueFromListOfNumericalSequence(this.thirdList));
        assertEquals(3, OperationWithListOfNumericalSequence.getAverageValueFromListOfNumericalSequence(this.fourthList));
    }

    @Test
    void getAverageValueFromListOfNumericalSequenceException() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            OperationWithListOfNumericalSequence.getAverageValueFromListOfNumericalSequence(this.exceptionList);
        });

        String actualMessage = exception.getMessage();
        String expectedMessage = "/ by zero";

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void compareAndGetResultMessageOfTwoLists() {
        assertEquals(-1, OperationWithListOfNumericalSequence.compareAndGetResultMessageOfTwoLists(firstList, secondList));
        assertEquals(1, OperationWithListOfNumericalSequence.compareAndGetResultMessageOfTwoLists(thirdList, fourthList));
        assertEquals(0, OperationWithListOfNumericalSequence.compareAndGetResultMessageOfTwoLists(fourthList, thirdList));
    }
}