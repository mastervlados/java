package gb.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @CsvSource({
            "6, true",
            "7, false",
            "10, true",
            "4, true",
            "-11, false",
    })
    void evenOddNumber(int n, boolean expectedResult) {
        assertEquals(expectedResult, Main.evenOddNumber(n));
    }

    @ParameterizedTest
    @CsvSource({
            "25, false",
            "100, false",
            "26, true",
            "55, true",
            "99, true",
    })
    void numberInInterval(int n, boolean expectedResult) {
        assertEquals(expectedResult, Main.numberInInterval(n));
    }
}