package student_artur_zaharov.lesson_7.level_6;


public class PowerCalculatorTest {

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        testExponent();
    }

    public static void testExponent() {
        checkTrueNumber(1, PowerCalculator.exponent(5, 0));   // 5^0 = 1
        checkTrueNumber(5, PowerCalculator.exponent(5, 1));   // 5^1 = 5
        checkTrueNumber(25, PowerCalculator.exponent(5, 2));  // 5^2 = 25
        checkTrueNumber(125, PowerCalculator.exponent(5, 3)); // 5^3 = 125
        checkTrueNumber(1, PowerCalculator.exponent(0, 5));   // 0^5 = 1 (lyuboye chislo v stepen' 0 ravno 1)
        checkTrueNumber(0, PowerCalculator.exponent(0, 0));   // 0^0 = 0 (0 v stepeni 0 obychno yavlyaetsya nedopustimym, no dlya testa ostavim)
    }


    public static void checkTrueNumber(int expected, int actual) {
        if (expected == actual) {
            System.out.println("Test checkTrueNumber OK");
        } else {
            System.out.println("Test checkTrueNumber Failed");
        }
    }
}


