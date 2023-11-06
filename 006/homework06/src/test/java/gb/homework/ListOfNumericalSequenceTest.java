package gb.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ListOfNumericalSequenceTest {
    ListOfNumericalSequence current;
    @BeforeEach
    void setUp() {
        this.current = new ListOfNumericalSequence(List.of(5, 6, 7, 8, 9, 0, 15));
    }

    @Test
    void getSequence() {
        assertEquals(List.of(5, 6, 7, 8, 9, 0, 15), current.getSequence());
    }

    @Test
    void setSequence() {
        current.setSequence(List.of(1, 3, 3, 7));
        assertEquals(current.getSequence(), List.of(1, 3, 3, 7));
    }

    @Test
    void addNumber() {
        current.addNumber(10);
        current.addNumber(7);
        assertEquals(current.getSequence(), List.of(5, 6, 7, 8, 9, 0, 15, 10, 7));
    }
}