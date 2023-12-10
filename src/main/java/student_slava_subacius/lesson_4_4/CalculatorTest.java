package student_slava_subacius.lesson_4_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        testFindMaxOfThree();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();

        int evenNumber = 10;
        boolean expectedEvenResult = true;
        boolean realEvenResult = calculator.isEven(evenNumber);
        if (realEvenResult == expectedEvenResult) {
            System.out.println("isEven test with even number = OK");
        } else {
            System.out.println("isEven test with even number = FAIL");
        }

        int oddNumber = 7;
        boolean expectedOddResult = false;
        boolean realOddResult = calculator.isEven(oddNumber);
        if (realOddResult == expectedOddResult) {
            System.out.println("isEven test with odd number = OK");
        } else {
            System.out.println("isEven test with odd number = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        Calculator calculator = new Calculator();


        int maxResult1 = calculator.maxOfTwoNumbers(10, 5);
        if (maxResult1 == 10) {
            System.out.println("maxOfTwoNumbers test (first number is greater) = OK");
        } else {
            System.out.println("maxOfTwoNumbers test (first number is greater) = FAIL");
        }

        int maxResult2 = calculator.maxOfTwoNumbers(3, 9);
        if (maxResult2 == 9) {
            System.out.println("maxOfTwoNumbers test (second number is greater) = OK");
        } else {
            System.out.println("maxOfTwoNumbers test (second number is greater) = FAIL");
        }

        int maxResult3 = calculator.maxOfTwoNumbers(6, 6);
        if (maxResult3 == 6) {
            System.out.println("maxOfTwoNumbers test (both numbers are equal) = OK");
        } else {
            System.out.println("maxOfTwoNumbers test (both numbers are equal) = FAIL");
        }
    }

    private static void testMaxOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int result1 = calculator.maxOfTwoNumbers(10, 5);
        assert result1 == 10 : "maxOfTwoNumbers test (first number is greater) failed";

        int result2 = calculator.maxOfTwoNumbers(3, 9);
        assert result2 == 9 : "maxOfTwoNumbers test (second number is greater) failed";

        int result3 = calculator.maxOfTwoNumbers(6, 6);
        assert result3 == 6 : "maxOfTwoNumbers test (both numbers are equal) failed";
    }

    private static void testFindMaxOfThree() {
        Calculator calculator = new Calculator();
        int result1 = calculator.findMaxOfThree(6, 5, 4);
        assert result1 == 6 : "findMaxOfThree test (first number is greater) failed";

        int result2 = calculator.findMaxOfThree(3, 9, 6);
        assert result2 == 9 : "findMaxOfThree test (second number is greater) failed";

        int result3 = calculator.findMaxOfThree(8, 8, 8);
        assert result3 == 8 : "findMaxOfThree test (all numbers are equal) failed";
    }
}

