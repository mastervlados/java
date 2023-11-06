package gb.homework;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListOfNumericalSequenceComparatorTest {
    ListOfNumericalSequenceComparator<ListOfNumericalSequence> comparator;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        this.comparator = new ListOfNumericalSequenceComparator<>();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void compareEqual() {
        int result = this.comparator.compare(new ListOfNumericalSequence(List.of(1, 2, 3)), new ListOfNumericalSequence(List.of(3, 2, 1)));
        assertEquals("Average values of both of Lists are equal!", outContent.toString().trim());
    }
    @Test
    void compareMore() {
        int result = this.comparator.compare(new ListOfNumericalSequence(List.of(4, 5, 6)), new ListOfNumericalSequence(List.of(3, 2, 4)));
        assertEquals("First List has 5 average value that more than the Second List (3)", outContent.toString().trim());
    }

    @Test
    void compareLess() {
        int result = this.comparator.compare(new ListOfNumericalSequence(List.of(3, 2, 4)), new ListOfNumericalSequence(List.of(4, 5, 6)));
        assertEquals("Second List has 3 average value that less than the First List (5)", outContent.toString().trim());
    }
}