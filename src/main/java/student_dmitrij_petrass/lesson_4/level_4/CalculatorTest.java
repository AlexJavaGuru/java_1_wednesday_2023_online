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
        calculatorTest.testSecondAndThirdIsEqualAndGreaterThenFirst();
        calculatorTest.testFirstAndThirdIsEqualAndGreaterThenSecond();
        calculatorTest.testThreeNumberAreEqual();
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
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("First number is greater then second number TEST = has passed!");
        } else {
            System.out.println("First number is greater then second number TEST = FALSE");
        }
    }

    public void testSecondNumberIsGreater() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Second number is greater then first number TEST = has passed!");
        } else {
            System.out.println("Second number is greater then first number TEST = FALSE");
        }
    }

    public void testTwoNumbersAreEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Two numbers ares equal TEST = has passed!");
        } else {
            System.out.println("Two numbers ares equal TEST = FALSE");
        }
    }

    public void testFirstNumberIsGreaterThenSecondAndThird() {
        int firstNumber = 15;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First number is greater then second and third number TEST = has passed!");
        } else {
            System.out.println("First number is greater then second and third number TEST = FALSE");

        }
    }

    public void testSecondNumberIsGreaterThenFirstAndThird() {
        int firstNumber = 10;
        int secondNumber = 15;
        int thirdNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Second number is greater then first and third number TEST = has passed!");
        } else {
            System.out.println("Second number is greater then first and third number TEST = FALSE");

        }
    }

    public void testThirdNumberIsGreaterThenFirstAndSecond() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 15;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Third number is greater then first and second number TEST = has passed!");
        } else {
            System.out.println("Third number is greater then first and second number TEST = FALSE");

        }
    }

    public void testFirstAndSecondIsEqualAndGreaterThenThird() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First and second number is equal and greater then third number TEST = has passed!");
        } else {
            System.out.println("First and second number is equal and greater then third number TEST = FALSE");

        }
    }

    public void testSecondAndThirdIsEqualAndGreaterThenFirst() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Second and third number is equal and greater then first number TEST = has passed!");
        } else {
            System.out.println("Second and third number is equal and greater then first number TEST = FALSE");

        }
    }

    public void testFirstAndThirdIsEqualAndGreaterThenSecond() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First and third number is equal and greater then second number TEST = has passed!");
        } else {
            System.out.println("First and third number is equal and greater then second number TEST = FALSE");

        }
    }

    public void testThreeNumberAreEqual() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Three numbers are equal TEST = has passed!");
        } else {
            System.out.println("Three numbers are equal TEST = FALSE");

        }
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




