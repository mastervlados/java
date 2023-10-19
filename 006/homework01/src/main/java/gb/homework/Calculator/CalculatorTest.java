package gb.homework.Calculator;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {
    @Test
    @DisplayName("Test calculationDiscont() with right parameters")
    public void testCalculatingDiscount() {
        double test = Calculator.calculatingDiscount(100, 20);
        assertThat(test).isEqualTo(80);

        test = Calculator.calculatingDiscount(10, 80);
        assertThat(test).isEqualTo(2);
    }

    @Test
    @DisplayName("Test calculationDiscont() with wrong parameters that throw exceptions")
    public void testCalculatingDiscountThrows() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.calculatingDiscount(-100, 99);
        });

        String expectedMessage = "Total sum isn't be equal or less than zero.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.calculatingDiscount(50, -20);
        });

        expectedMessage = "Uncorrect discount value.";
        actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}