package student_svetlana_daugele.lesson_7.level_5;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.calculateNumberInPowerTest(2,3, 8);
    }

    public void calculateNumberInPowerTest(int number, int power, int expectedResult) {
        PowerCalculator powerCalculator = new PowerCalculator();
        int testResult = powerCalculator.calculateNumberInPower(number, power);

        if (expectedResult == testResult) {
            System.out.println("Test is OK.");
        } else {
            System.out.println("Test is FALSE.");

        }
    }
}
