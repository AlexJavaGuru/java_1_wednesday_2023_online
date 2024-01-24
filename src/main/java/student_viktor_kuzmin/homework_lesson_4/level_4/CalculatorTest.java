package student_viktor_kuzmin.homework_lesson_4.level_4;


class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwo1();
        calculatorTest.maxOfTwo2();
        calculatorTest.maxOfTwoEquals();
        calculatorTest.maxOfThree1();
        calculatorTest.maxOfThree2();
        calculatorTest.maxOfThree3();
        calculatorTest.maxOfThree12();
        calculatorTest.maxOfThree23();
        calculatorTest.maxOfThree13();
        calculatorTest.maxOfThree123();


    }

    public void sumTest() {
        int valueA = 10;
        int valueB = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(10, 5);
        if (realResult == expectedResult) {
            System.out.println("SUM test OK");
        } else {
            System.out.println("SUM test Fail");
        }
    }

    public void subTest() {
        int valueA = 10;
        int valueB = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(10, 5);
        if (realResult == expectedResult) {
            System.out.println("SUB test OK");
        } else {
            System.out.println("SUB test Fail");
        }
    }

    public void multTest() {
        int valueA = 10;
        int valueB = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(10, 5);
        if (realResult == expectedResult) {
            System.out.println("MULT test OK");
        } else {
            System.out.println("MULT test Fail");
        }
    }

    public void divTest() {
        int valueA = 10;
        int valueB = 5;
        double expectedResult = 2;
        Calculator calculator = new Calculator();
        double realResult = calculator.div(10, 5);
        if (realResult == expectedResult) {
            System.out.println("DIV test OK");
        } else {
            System.out.println("DIV test Fail");
        }
    }

    public void isEvenTest() {
        int value = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(10);
        if (realResult == expectedResult) {
            System.out.println("isEven test OK");
        } else {
            System.out.println("isEven test Fail");
        }
    }

    public void maxOfTwo1() {
        int valueA = 10;
        int valueB = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(10, 5);
        if (expectedResult == realResult) {
            System.out.println("first number of two is greather test OK");
        } else {
            System.out.println("first number of two is greather test FAIL");
        }

    }

    public void maxOfTwo2() {
        int valueA = 5;
        int valueB = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(5, 10);
        if (expectedResult == realResult) {
            System.out.println("second number of two is greather test OK");
        } else {
            System.out.println("second number of two is greather test FAIL");
        }
    }

    public void maxOfTwoEquals() {
        int valueA = 10;
        int valueB = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(10, 10);
        if (expectedResult == realResult) {
            System.out.println("both equals test OK");
        } else {
            System.out.println("both equals test FAIL");
        }
    }

    public void maxOfThree1() {
        int valueA = 10;
        int valueB = 8;
        int valueC = 7;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(10, 8, 7);
        if (expectedResult == realResult) {
            System.out.println("first number of three is greather test OK");
        } else {
            System.out.println("first number of three is greather test FAILED");
        }
    }

    public void maxOfThree2() {
        int valueA = 7;
        int valueB = 10;
        int valueC = 9;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(7, 10, 9);
        if (expectedResult == realResult) {
            System.out.println("second number of three is greather test OK");
        } else {
            System.out.println("second number of three is greather test FAILED");
        }
    }

    public void maxOfThree3() {
        int valueA = 6;
        int valueB = 8;
        int valueC = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(6, 8, 10);
        if (expectedResult == realResult) {
            System.out.println("third number of three is greather test OK");
        } else {
            System.out.println("third number of three is greather test FAILED");
        }
    }

    public void maxOfThree12() {
        int valueA = 10;
        int valueB = 10;
        int valueC = 7;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(10, 10, 7);
        if (expectedResult == realResult) {
            System.out.println("first two number of three is greather test OK");
        } else {
            System.out.println("first two number of three is greather test FAILED");
        }
    }

    public void maxOfThree23() {
        int valueA = 7;
        int valueB = 10;
        int valueC = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(7, 10, 10);
        if (expectedResult == realResult) {
            System.out.println("last two number of three is greather test OK");
        } else {
            System.out.println("last two number of three is greather test FAILED");
        }
    }

    public void maxOfThree13() {
        int valueA = 10;
        int valueB = 6;
        int valueC = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(10, 6, 10);
        if (expectedResult == realResult) {
            System.out.println("first and third numbers are greather test OK");
        } else {
            System.out.println("first and third numbers are greather test FAILED");
        }
    }

    public void maxOfThree123() {
        int valueA = 10;
        int valueB = 10;
        int valueC = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(10, 10, 10);
        if (expectedResult == realResult) {
            System.out.println("all numbers are equal test OK");
        } else {
            System.out.println("all numbers are equal test FAILED");
        }
    }
}




