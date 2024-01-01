package student_aleksandrs_jeleckis.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.divTest();
        calculatorTest.multTest();
        calculatorTest.subTest();
        calculatorTest.isEvenTest();
        calculatorTest.firstNumberHigherTest();
        calculatorTest.secondNumberHigherTest();
        calculatorTest.NumbersEqualTest();
        calculatorTest.firstNumbersHigherTest();
        calculatorTest.secondNumbersHigherTest();
        calculatorTest.thirdNumbersHigherTest();
        calculatorTest.twoNumbersEqualTest();
        calculatorTest.allNumberEqualTest();
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

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mult test = OK");
        } else {
            System.out.println("Mult test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 2;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean boolResult = calculator.isEven(number);
        if (boolResult == expectedResult) {
            System.out.println("isEven test passed");
        } else {
            System.out.println("isEven test failed");
        }
    }

    public void firstNumberHigherTest() {

        int numberOne = 2;
        int numberTwo = 1;
        int expectedResult = numberOne;

        Calculator firstNumberHigherTest = new Calculator();
        int actualResult = firstNumberHigherTest.maxOfTwoNumbers(numberOne, numberTwo);
        if (actualResult == expectedResult) {
            System.out.println("Number one test passed");
        } else {
            System.out.println("Number one test failed ");
        }
    }

    public void secondNumberHigherTest() {

        int numberOne = 1;
        int numberTwo = 2;
        int expectedResult = numberTwo;

        Calculator twoNumberHigherTest = new Calculator();
        int actualResult = twoNumberHigherTest.maxOfTwoNumbers(numberOne, numberTwo);
        if (actualResult == expectedResult) {
            System.out.println("Number two test passed");
        } else {
            System.out.println("Number two test failed ");
        }
    }

    public void NumbersEqualTest() {

        int numberOne = 2;
        int numberTwo = 2;
        int expectedResult = 2;

        Calculator twoNumberHigherTest = new Calculator();
        int actualResult = twoNumberHigherTest.maxOfTwoNumbers(numberOne, numberTwo);
        if (actualResult == expectedResult) {
            System.out.println("Equal number test passed");
        } else {
            System.out.println("Equal number test failed ");
        }
    }

    public void firstNumbersHigherTest() {

        int numberOne = 3;
        int numberTwo = 2;
        int numberThree = 1;
        int expectedResult = numberOne;

        Calculator firstNumbersHigherTest = new Calculator();
        int actualResult = firstNumbersHigherTest.maxOfThreeNumbers(numberOne, numberTwo, numberThree);
        if (actualResult == expectedResult) {
            System.out.println("Numbers one test passed");
        } else {
            System.out.println("Number one test failed ");
        }
    }

    public void secondNumbersHigherTest() {

        int numberOne = 2;
        int numberTwo = 3;
        int numberThree = 1;
        int expectedResult = numberTwo;

        Calculator secondNumbersHigherTest = new Calculator();
        int actualResult = secondNumbersHigherTest.maxOfThreeNumbers(numberOne, numberTwo, numberThree);
        if (actualResult == expectedResult) {
            System.out.println("Numbers two test passed");
        } else {
            System.out.println("Number two test failed ");
        }
    }

    public void thirdNumbersHigherTest() {

        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int expectedResult = numberThree;
        Calculator thirdNumbersHigherTest = new Calculator();
        int actualResult = thirdNumbersHigherTest.maxOfThreeNumbers(numberOne, numberTwo, numberThree);
        if (actualResult == expectedResult) {
            System.out.println("Numbers three test passed");
        } else {
            System.out.println("Number three test failed ");
        }
    }

    public void twoNumbersEqualTest() {

        int numberOne = 2;
        int numberTwo = 2;
        int numberThree = 1;
        int expectedResult = 2;
        Calculator thirdNumbersHigherTest = new Calculator();
        int actualResult = thirdNumbersHigherTest.maxOfThreeNumbers(numberOne, numberTwo, numberThree);
        if (actualResult == expectedResult) {
            System.out.println("Numbers are equal and higher than third test passed");
        } else {
            System.out.println("Numbers are equal and higher than third test failed");
        }
    }
    public void allNumberEqualTest() {

        int numberOne = 2;
        int numberTwo = 2;
        int numberThree = 2;
        int expectedResult = 2;
        Calculator thirdNumbersHigherTest = new Calculator();
        int actualResult = thirdNumbersHigherTest.maxOfThreeNumbers(numberOne, numberTwo, numberThree);
        if (actualResult == expectedResult) {
            System.out.println("All numbers are equal test passed");
        } else {
            System.out.println("All numbers are equal test failed");
        }
    }
}