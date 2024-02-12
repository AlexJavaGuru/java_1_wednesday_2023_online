package student_viktor_kuzmin.homework_lesson_7.level_5;

class PowerCalculatorTest {

    public static void main(String[] args) {
        testPositivePower();
        testNegativePower();
        testZeroPower();
    }

    public static void testPositivePower() {
        PowerCalculator calculator = new PowerCalculator();
        double result = calculator.raisingToPower(2, 3);
        if (result == 8.0) {
            System.out.println("Positive Power Test Passed");
        } else {
            System.out.println("Positive Power Test Failed");
        }
    }

    public static void testNegativePower() {
        PowerCalculator calculator = new PowerCalculator();
        double result = calculator.raisingToPower(3, -2);
        if (Math.abs(result - 0.111) < 0.001) {
            System.out.println("Negative Power Test Passed");
        } else {
            System.out.println("Negative Power Test Failed");
        }
    }

    public static void testZeroPower() {
        PowerCalculator calculator = new PowerCalculator();
        double result = calculator.raisingToPower(5, 0);
        if (result == 1.0) {
            System.out.println("Zero Power Test Passed");
        } else {
            System.out.println("Zero Power Test Failed");
        }
    }

}


