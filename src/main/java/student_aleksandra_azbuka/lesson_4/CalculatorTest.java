package student_aleksandra_azbuka.lesson_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersFirstGreater();
        calculatorTest.maxOfTwoNumbersSecondGreater();
        calculatorTest.maxOfTwoNumbersAllEqual();
        calculatorTest.maxOfThreeNumbersFirstGreater();
        calculatorTest.maxOfThreeNumbersSecondGreater();
        calculatorTest.maxOfThreeNumbersThirdGreater();
        calculatorTest.maxOfThreeNumbersAllNumbersEqual();
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
            System.out.println("Subtract test = OK.");
        } else {
            System.out.println("Subtract test = FAIL.");
        }
    }

    public void multiplyTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK.");
        } else {
            System.out.println("Multiply test = FAIL.");
        }
    }

    public void divideTest() {
        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK.");
        } else {
            System.out.println("Multiply test = FAIL.");
        }
    }

    public void isEvenTest() {
        int number = 6;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEven test = OK.");
        } else {
            System.out.println("isEven test = FAIL.");
        }
    }

    public void maxOfTwoNumbersFirstGreater() {
        int firstGreater = 10;
        int secondLess = 5;
        int expectedResultGreater = firstGreater;
        Calculator calculator = new Calculator();
        int realResultGreater = calculator.maxOfTwoNumbers(firstGreater, secondLess);
        if (realResultGreater == expectedResultGreater) {
            System.out.println("First number is greater test = OK.");
        } else {
            System.out.println("First number is greater test = FAIL.");
        }
    }
    public void maxOfTwoNumbersSecondGreater() {
        int firstLess = 5;
        int secondGreater = 15;
        int expectedResultLess = secondGreater;
        Calculator calculator = new Calculator();
        int realResultLess = calculator.maxOfTwoNumbers(firstLess, secondGreater);
        if (realResultLess == expectedResultLess) {
            System.out.println("First number is less test = OK.");
        } else {
            System.out.println("First number is less test = FAIL.");
        }
    }
    public void maxOfTwoNumbersAllEqual(){
        int allEqual = 10;
        int expectedResultEqual = allEqual;
        Calculator calculator = new Calculator();
        int realResultEqual= calculator.maxOfTwoNumbers(allEqual, allEqual);
        if (realResultEqual == expectedResultEqual) {
            System.out.println("Equal test = OK.");
        } else {
            System.out.println("Equal test = FAIL.");
        }
    }

    public void maxOfThreeNumbersFirstGreater() {
        int firstGreater = 10;
        int secondLess = 5;
        int thirdLess = 7;
        int expectedResultGreater = firstGreater;
        Calculator calculator = new Calculator();
        int realResultGreater = calculator.maxOfThreeNumbers(firstGreater, secondLess, thirdLess);
        if (realResultGreater == expectedResultGreater) {
            System.out.println("First number is greater than second and third test = OK.");
        } else {
            System.out.println("First number is greater than second and third test = FAIL.");
        }
    }

    public void maxOfThreeNumbersSecondGreater() {
        int firstLess = 4;
        int secondGreater = 25;
        int thirdLess = 7;
        int expectedResultGreater = secondGreater;
        Calculator calculator = new Calculator();
        int realResultGreater = calculator.maxOfThreeNumbers(firstLess, secondGreater, thirdLess);
        if (realResultGreater == expectedResultGreater) {
            System.out.println("Second number is greater than first and third test = OK.");
        } else {
            System.out.println("Second number is greater than first and third test = FAIL.");
        }
    }

    public void maxOfThreeNumbersThirdGreater() {
        int firstLess = 4;
        int secondLess = 25;
        int thirdGreater = 77;
        int expectedResultGreater = thirdGreater;
        Calculator calculator = new Calculator();
        int realResultGreater = calculator.maxOfThreeNumbers(firstLess, secondLess, thirdGreater);
        if (realResultGreater == expectedResultGreater) {
            System.out.println("Third number is greater than first and second test = OK.");
        } else {
            System.out.println("Third number is greater than first and second test = FAIL.");
        }
    }
    public void maxOfThreeNumbersAllNumbersEqual() {
        int allEqual = 10;
        int expectedResultEqual = allEqual;
        Calculator calculator = new Calculator();
        int realResultEqual = calculator.maxOfThreeNumbers(allEqual, allEqual, allEqual);
        if (realResultEqual == expectedResultEqual) {
            System.out.println("All numbers are equal test = OK.");
        } else {
            System.out.println("All numbers are equal test = FAIL.");
        }
    }
}