package student_svetlana_daugele.lesson_4.level_4_junior;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
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

    public void subtractTest() {
        int firstNumber = 7;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int expectedResult = 4;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 7;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int expectedResult = 21;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 12;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int expectedResult = 4;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 12;
        boolean expectedResult = true;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 12;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int expectedResult = 12;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of 2 numbers test 1 = OK");
        } else {
            System.out.println("Max of 2 numbers test 1 = FAIL");
        }

    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 4;  // подготавливаем тестовые данные
        int secondNumber = 8;  // подготавливаем тестовые данные
        int expectedResult = 8;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of 2 numbers test 2 = OK");
        } else {
            System.out.println("Max of 2 numbers test 2 = FAIL");
        }
    }
    public void maxOfTwoNumbersTest3() {
        int firstNumber = 6;  // подготавливаем тестовые данные
        int secondNumber = 6;  // подготавливаем тестовые данные
        int expectedResult = 6;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of 2 numbers test 3 = OK");
        } else {
            System.out.println("Max of 2 numbers test 3 = FAIL");
        }

    }
    public void maxOfThreeNumbersTest1() {
        int firstNumber = 5;  // подготавливаем тестовые данные
        int secondNumber = 4;  // подготавливаем тестовые данные
        int thirdNumber = 3;
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of 3 numbers test 1 = OK");
        } else {
            System.out.println("Max of 3 numbers test 1 = FAIL");
        }

    }
    public void maxOfThreeNumbersTest2() {
        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int thirdNumber = 4;
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of 3 numbers test 2 = OK");
        } else {
            System.out.println("Max of 3 numbers test 2 = FAIL");
        }
    }
        public void maxOfThreeNumbersTest3() {
            int firstNumber = 2;  // подготавливаем тестовые данные
            int secondNumber = 5;  // подготавливаем тестовые данные
            int thirdNumber = 49;
            int expectedResult = 49;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                System.out.println("Max of 3 numbers test 3 = OK");
            } else {
                System.out.println("Max of 3 numbers test 3 = FAIL");
            }
    }
    public void maxOfThreeNumbersTest4() {
        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int thirdNumber = 49;
        int expectedResult = 49;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of 3 numbers test 4 = OK");
        } else {
            System.out.println("Max of 3 numbers test 4 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest5() {
        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int thirdNumber = 3;
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of 3 numbers test 5 = OK");
        } else {
            System.out.println("Max of 3 numbers test 5 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest6() {
        int firstNumber = 8;  // подготавливаем тестовые данные
        int secondNumber = 8;  // подготавливаем тестовые данные
        int thirdNumber = 8;
        int expectedResult = 8;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of 3 numbers test 6 = OK");
        } else {
            System.out.println("Max of 3 numbers test 6 = FAIL");
        }
    }
}

