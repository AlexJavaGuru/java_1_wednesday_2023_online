package student_svetlana_daugele.lesson_4.level_7_senior;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenExpected(40, true);
        calculatorTest.isEvenExpected(41, false);
        calculatorTest.test("Sum", 35, 40, 75);
        calculatorTest.test("Sub", 35, 15, 20);
        calculatorTest.test("Mul", 5, 5, 25);
        calculatorTest.test("Div", 40, 8, 5);

    }

    public void test(String testName, int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = switch (testName) {
            case "Sum" -> calculator.sum(firstNumber, secondNumber);
            case "Sub" -> calculator.sub(firstNumber, secondNumber);
            case "Div" -> calculator.div(firstNumber, secondNumber);
            case "Mul" -> calculator.mul(firstNumber, secondNumber);
            default -> 0;
        };
        if (result == expectedResult) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void isEvenExpected (int number, boolean expected) {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result == expected) {
            System.out.println("isEven test for " + number + " = OK");
        } else {
            System.out.println("isEven test for " + number + " = FAIL");
        }
    }
}
