package teacher.lesson_13_junit.lessoncode.multilayer;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;
    //Alt + Insert

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sum() {
        int expected = 15;
        int result = calculator.sum(10, 5);
        assertEquals(expected, result, "Sum must be equal to 15");
    }

    @Test
    void sumNegativeDigits() {
        int expected = -5;
        int result = calculator.sum(-10, 5);
        assertEquals(expected, result, "Sum must be equal to -5");
    }
}