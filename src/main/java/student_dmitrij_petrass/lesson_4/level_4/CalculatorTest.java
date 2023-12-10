package student_dmitrij_petrass.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.testSum();
        calculatorTest.testSub();
        calculatorTest.testMultiply();
        calculatorTest.testDivide();
        calculatorTest.testIsEven();
        calculatorTest.testFirstNumberIsGreater();
        calculatorTest.testSecondNumberIsGreater();
        calculatorTest.testTwoNumbersAreEqual();
        calculatorTest.testFirstNumberIsGreaterThenSecondAndThird();
        calculatorTest.testSecondNumberIsGreaterThenFirstAndThird();
        calculatorTest.testThirdNumberIsGreaterThenFirstAndSecond();
        calculatorTest.testFirstAndSecondIsEqualAndGreaterThenThird();
        //calculatorTest.testSecondAndThirdIsEqualAndGreaterThenFirst();
        //calculatorTest.testFirstAndThirdIsEqualAndGreaterThenSecond();
        //calculatorTest.testThreeNumberAreEqual();
    }

    public void testSum() {
        Calculator calculator = new Calculator();
        int expectedResult = 30;
        int actualResult = calculator.sum(10, 20);

        check(expectedResult, actualResult, "Test 1: Sum of two numbers");

    }

    public void testSub() {
        Calculator calculator = new Calculator();
        int expectedResult = -10;
        int actualResult = calculator.subtract(10, 20);

        check(expectedResult, actualResult, "Test 2: Sub of two numbers");
    }

    public void testMultiply() {
        Calculator calculator = new Calculator();
        int expectedResult = 200;
        int actualResult = calculator.multiply(10, 20);

        check(expectedResult, actualResult, "Test 3: Mult of two numbers");
    }

    public void testDivide() {
        Calculator calculator = new Calculator();
        int expectedResult = 2;
        double actualResult = calculator.divide(20, 10);

        check(expectedResult, (int)actualResult, "Test 4: Div of two numbers");
    }

    public void testIsEven() {
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(10);

        check(actualResult, "Test 5: number is even ");
    }

    public void testFirstNumberIsGreater() {
        Calculator calculator = new Calculator();
        int expectedResult = 10;
        int actualResult = calculator.maxOfTwoNumbers(5, 10);

        check(expectedResult, actualResult, "Test 6: First number is Greater then second");

        }

    public void testSecondNumberIsGreater() {
        Calculator calculator = new Calculator();
        int expectedResult = 10;
        int actualResult = calculator.maxOfTwoNumbers(10, 5);

        check(expectedResult, actualResult, "Test 7: Second number is Greater then first");

    }
    public void testTwoNumbersAreEqual() {
        Calculator calculator = new Calculator();
        int expectedResult = 5;
        int actualResult = calculator.maxOfTwoNumbers(5, 5);

        check(expectedResult, actualResult, "Test 8: Two numbers are equal");

    }

    public void testFirstNumberIsGreaterThenSecondAndThird() {
        Calculator calculator = new Calculator();
        int expectedResult = 100;
        int actualResult = calculator.maxOfThreeNumbers(100,20,30);

        check(expectedResult, actualResult, "Test 9: First number is greater then second and third");
    }

    public void testSecondNumberIsGreaterThenFirstAndThird() {
        Calculator calculator = new Calculator();
        int expectedResult = 100;
        int actualResult = calculator.maxOfThreeNumbers(20,100,30);

        check(expectedResult, actualResult, "Test 10: Second number is greater then first and third");
    }

    public void testThirdNumberIsGreaterThenFirstAndSecond() {
        Calculator calculator = new Calculator();
        int expectedResult = 100;
        int actualResult = calculator.maxOfThreeNumbers(20,30, 100);

        check(expectedResult, actualResult, "Test 11: Third number is greater then first and second");
    }

    public void testFirstAndSecondIsEqualAndGreaterThenThird() {
        Calculator calculator = new Calculator();
        int expectedResult = 40;
        int actualResult = calculator.maxOfThreeNumbers(40,40, 20);

        check(expectedResult, actualResult, "Test 12: First and second number is equal and greater third number");
    }



    private void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed!");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    private void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed!");
            System.out.println("Expected result = true" + " but actual result = " + actualResult);
        }
    }
}




