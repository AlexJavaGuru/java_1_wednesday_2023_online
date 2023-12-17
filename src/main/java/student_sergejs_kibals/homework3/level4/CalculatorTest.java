package student_sergejs_kibals.homework3.level4;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.additionTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        System.out.println();
        calculatorTest.isEvenTest();
        System.out.println();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        System.out.println();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
    }

    public void additionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int actualResult = calculator.addition(firstNumber, secondNumber);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.subtraction(firstNumber, secondNumber);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiplication(firstNumber, secondNumber);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int actualResult = calculator.division(firstNumber, secondNumber);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void isEvenTest() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(number);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 10;
        int secondNumber = 5;
        int equalNumbers = 0;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber, equalNumbers);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 5;
        int secondNumber = 10;
        int equalNumbers = 0;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber, equalNumbers);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void maxOfTwoNumbersTest3() {
        int firstNumber = 10;
        int secondNumber = 10;
        int equalNumbers = 0;
        int expectedResult = 0;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber, equalNumbers);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void maxOfThreeNumbersTest1() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 1;
        int equalNumbers = 0;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber, equalNumbers);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void maxOfThreeNumbersTest2() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 1;
        int equalNumbers = 0;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber, equalNumbers);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 3;
        int equalNumbers = 0;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber, equalNumbers);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void maxOfThreeNumbersTest4() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 1;
        int equalNumbers = 0;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber, equalNumbers);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void maxOfThreeNumbersTest5() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 2;
        int equalNumbers = 0;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber, equalNumbers);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void maxOfThreeNumbersTest6() {
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 2;
        int equalNumbers = 0;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber, equalNumbers);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void maxOfThreeNumbersTest7() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 2;
        int equalNumbers = 0;
        int expectedResult = 0;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber, equalNumbers);
        if (actualResult == expectedResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}