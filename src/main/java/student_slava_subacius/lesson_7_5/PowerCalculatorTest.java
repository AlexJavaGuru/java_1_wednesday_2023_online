package student_slava_subacius.lesson_7_5;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();

        assert calculator.calculatePower(2, 3) == 8;
        assert calculator.calculatePower(5, 0) == 1;
        assert calculator.calculatePower(10, 5) == 100000;
        assert calculator.calculatePower(3, 4) == 81;

        System.out.println("All test cases passed!");
    }
}

