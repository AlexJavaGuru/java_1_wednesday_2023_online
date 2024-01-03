package student_svetlana_daugele.lesson_8.level_7_MathOperation;

public class MathOperationTest {


    public static void main(String[] args) {
        MathOperationTest mathOperationTest = new MathOperationTest();
        mathOperationTest.additionTest("Addition", 3, 4, 7);
        mathOperationTest.divideTest("Divide", 25, 5, 5);
        mathOperationTest.multiplyTest("Multiply", 5, 4, 20);
        mathOperationTest.subtractionTest("Substraction",10,7, 3);

    }

    private void subtractionTest(String testName,double leftArgument,
                                 double rightArgument, double expectedResult) {
        Argument arg1 = new Argument(leftArgument);
        Argument arg2 = new Argument(rightArgument);
        Subtraction subtraction = new Subtraction(arg1, arg2);
        double actualResult = subtraction.calculate();
        checkTestResult(testName, expectedResult,actualResult);
    }

    private void multiplyTest(String testName,double leftArgument,
                              double rightArgument, double expectedResult) {
        Argument arg1 = new Argument(leftArgument);
        Argument arg2 = new Argument(rightArgument);
        Multiply multiply = new Multiply(arg1, arg2);
        double actualResult = multiply.calculate();
        checkTestResult(testName, expectedResult,actualResult);

    }

    private void divideTest(String testName,double leftArgument,
                            double rightArgument, double expectedResult) {
        Argument arg1 = new Argument(leftArgument);
        Argument arg2 = new Argument(rightArgument);
        Divide divide = new Divide(arg1, arg2);
        double actualResult = divide.calculate();
        checkTestResult(testName, expectedResult,actualResult);

    }

    private void additionTest(String testName,double leftArgument,
                              double rightArgument, double expectedResult) {
        Argument arg1 = new Argument(leftArgument);
        Argument arg2 = new Argument(rightArgument);
        Addition addition = new Addition(arg1, arg2);
        double actualResult = addition.calculate();
        checkTestResult(testName, expectedResult,actualResult);

    }

    private void checkTestResult(String testName, double expectedResult,
                                 double actualResult){
        if (expectedResult == actualResult){
            System.out.println(testName + " test is passed (OK)");
    } else {
            System.out.println(testName + " test is FAILED ");
        }
    }

}