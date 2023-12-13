package student_dmitrijs_voronins.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.testIsEven();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfTwoNumberTest1();
        calculatorTest.maxOfThreeNumberTest();
        calculatorTest.maxOfThreeNumberTest1();
        calculatorTest.maxOfThreeNumberTest2();
        calculatorTest.maxOfThreeNumberTest3();
        calculatorTest.maxOfThreeNumberTest4();
        calculatorTest.maxOfThreeNumberTest5();
        // по аналогии реализуйте тесты для остальных методов
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 15;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 5;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 25;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Mult test = OK");
        } else {
            System.out.println("Mult test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 25;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void testIsEven() {
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(3);

        if (realResult) {
            System.out.println("Even test = Ok");
        } else {
            System.out.println("Odd test : " + realResult);
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 25;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 25;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("max of two number  = OK");
        } else {
            System.out.println("max of two number  = FAIL");
        }

    }

    public void maxOfTwoNumberTest1() {
        int firstNumber = 5;  // подготавливаем тестовые данные
        int secondNumber = 25;  // подготавливаем тестовые данные
        int expectedResult = 25;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("max of two number  = OK");
        } else {
            System.out.println("max of two number  = FAIL");
        }
    }

    public void maxOfThreeNumberTest() {
        int firstNumber = 5;  // подготавливаем тестовые данные
        int secondNumber = 25;  // подготавливаем тестовые данные
        int thirdNumber = 18;
        int expectedResult = 25;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("max of three number  = OK");
        } else {
            System.out.println("max of three number  = FAIL");
        }

    }

    public void maxOfThreeNumberTest1() {
        int firstNumber = 18;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int thirdNumber = 7;
        int expectedResult = 18;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("max of three number  = OK");
        } else {
            System.out.println("max of three number  = FAIL");
        }

    }

    public void maxOfThreeNumberTest2() {
        int firstNumber = 5;  // подготавливаем тестовые данные
        int secondNumber = 18;  // подготавливаем тестовые данные
        int thirdNumber = 7;
        int expectedResult = 18;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("max of three number  = OK");
        } else {
            System.out.println("max of three number  = FAIL");
        }

    }

    public void maxOfThreeNumberTest3() {
        int firstNumber = 5;  // подготавливаем тестовые данные
        int secondNumber = 7;  // подготавливаем тестовые данные
        int thirdNumber = 18;
        int expectedResult = 18;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("max of three number  = OK");
        } else {
            System.out.println("max of three number  = FAIL");
        }

    }

    public void maxOfThreeNumberTest4() {
        int firstNumber = 18;  // подготавливаем тестовые данные
        int secondNumber = 18;  // подготавливаем тестовые данные
        int thirdNumber = 10;
        int expectedResult = 18;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("max of three number  = OK");
        } else {
            System.out.println("max of three number  = FAIL");
        }

    }

    public void maxOfThreeNumberTest5() {
        int firstNumber = 18;  // подготавливаем тестовые данные
        int secondNumber = 18;  // подготавливаем тестовые данные
        int thirdNumber = 18;
        int expectedResult = 18;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("max of three number  = OK");
        } else {
            System.out.println("max of three number  = FAIL");
        }

    }

}
