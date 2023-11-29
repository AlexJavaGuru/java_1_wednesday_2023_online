package teacher.lesson_4_if_statement.lessoncode.basictestapproach;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.testSumTwoPositiveNumbers();
        calculatorTest.testSumTwoNegativeNumbers();
        calculatorTest.testIsNumberEven();
    }

    public void testSumTwoPositiveNumbers() {
        Calculator victim = new Calculator();
        int expectedResult = 30;
        int actualResult = victim.sum(10, 20);

        check(expectedResult, actualResult, "Test 1");
    }

    public void testSumTwoNegativeNumbers() {
        Calculator calculator = new Calculator();
        int expectedResult = -30;
        int actualResult = calculator.sum(-10, -20);

        check(expectedResult, actualResult, "Test 2");
    }

    public void testIsNumberEven() {
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(10);

        check(actualResult, "Test 3");
    }

    private void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    private void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    private void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed");
            System.out.println("Expected: true" + " but Actual: " + actualResult);
        }
    }


}
