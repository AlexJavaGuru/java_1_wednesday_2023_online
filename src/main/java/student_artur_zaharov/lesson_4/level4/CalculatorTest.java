package student_artur_zaharov.lesson_4.level4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.testIsEvenT();
        calculatorTest.testIsEvenF();
        calculatorTest.maxOfTwoNumbersEQ();
        calculatorTest.maxOfTwoNumbersMore();
        calculatorTest.maxOfTwoNumbersLess();
        calculatorTest.threeNumber();
        calculatorTest.threeNumber2();
        calculatorTest.threeNumber3();
        calculatorTest.threeNumber4();
        calculatorTest.threeNumber5();



        // по аналогии реализуйте тесты для остальных методов
    }

    public void subTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        check(expectedResult, realResult, "subTest");
    }
        public void sumTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 15;
            Calculator calculator = new Calculator();
            int realResult = calculator.sum(firstNumber, secondNumber);
            check(expectedResult, realResult, "sumTest");

        }
                public void multTest() {
                    int firstNumber = 10;  // подготавливаем тестовые данные
                    int secondNumber = 5;  // подготавливаем тестовые данные
                    int expectedResult = 50;  // подготавливаем тестовые данные
                    Calculator calculator = new Calculator();
                    int realResult = calculator.mult(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
                    check(expectedResult, realResult, "multTest");
                }
    public void divTest() {
        int firstNumber = 5;  // подготавливаем тестовые данные
        int secondNumber = 10;  // подготавливаем тестовые данные
        double expectedResult = 0.5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        double realResult = calculator.div(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        check(expectedResult, realResult, "divTest");
    }
        public void testIsEvenT() {
            int firstNumber = 4;
            boolean expectedResult = true;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            boolean realResult = calculator.isEvenT(firstNumber);  // вызываем продакшен код, который хотим протестировать
            check (realResult, "testIsEven True");
    }
    public void testIsEvenF() {
        int firstNumber = 5;
        boolean expectedResult = true;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEvenT(firstNumber);  // вызываем продакшен код, который хотим протестировать
        check (!realResult, "testIsEven False");
    }
    public void maxOfTwoNumbersEQ() {
        int firstNumber = 4;
        int secondNumber = 4;
        String expectedResult = "firstNumber ravno secondNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check (expectedResult, realResult, "maxOfTwoNumbersEQ");
    }
    public void maxOfTwoNumbersMore() {
        int firstNumber = 10;
        int secondNumber = -5;
        String expectedResult = "firstNumber bolwe secondNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check (expectedResult, realResult, "maxOfTwoNumbersMore");
    }
    public void maxOfTwoNumbersLess() {
        int firstNumber = -5;
        int secondNumber = 10;
        String expectedResult = "firstNumber menwe secondNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check (expectedResult, realResult, "maxOfTwoNumbersLess");
    }

    public void threeNumber() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = -3;
        String expectedResult = "First number bolwe vseh";
        Calculator calculator = new Calculator();
        String realResult = calculator.threeNumber(firstNumber, secondNumber, thirdNumber);
        check (expectedResult, realResult, "cifra_1 bolwe vseh");
    }
    public void threeNumber2() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = -3;
        String expectedResult = "Second number bolwe vseh";
        Calculator calculator = new Calculator();
        String realResult = calculator.threeNumber(firstNumber, secondNumber, thirdNumber);
        check (expectedResult, realResult, "cifra_2 bolwe vseh");
    }

    public void threeNumber3() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 10;
        String expectedResult = "Third number bolwe vseh";
        Calculator calculator = new Calculator();
        String realResult = calculator.threeNumber(firstNumber, secondNumber, thirdNumber);
        check (expectedResult, realResult, "cifra_3 bolwe vseh");
    }

    public void threeNumber4() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 3;
        String expectedResult = "first and second equal and more than third number";
        Calculator calculator = new Calculator();
        String realResult = calculator.threeNumber(firstNumber, secondNumber, thirdNumber);
        check (expectedResult, realResult, "cifra_2 i 3 bolwe vseh");
    }

    public void threeNumber5() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 5;
        String expectedResult = "tri chisla ravni";
        Calculator calculator = new Calculator();
        String realResult = calculator.threeNumber(firstNumber, secondNumber, thirdNumber);
        check (expectedResult, realResult, "tri chisla ravni");
    }

    private void check (double expectedResult, double realResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println("Test name " + testName + " = OK");
        } else {
            System.out.println("Test name " + testName + " = FAIL");
            System.out.println("Expected: " + expectedResult + "of test" + testName + "but Actual: " + realResult);
        }
    }

    private void check (boolean realResult, String testName) {
        if (realResult) {
            System.out.println("Test name " + testName + " = OK");
        } else {
            System.out.println("Test name " + testName + " = FAIL");
            System.out.println("Expected: true" + "but Actual: " + realResult);
        }
    }

    private void check (String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " has PASSED!!");
        } else{
            System.out.println(testName + " has FAILED!!");
        }
    }
}



