package student_svetlana_daugele.lesson_8.level_7_MathOperation;

public class MathOperationDemoTest {
    public static void main(String[] args) {
        MathOperationDemoTest mathOperationDemoTest = new MathOperationDemoTest();
        mathOperationDemoTest.test(10,5,20,5,20);
        // Test for math expressions: (a - b) * (c / d)
    }

    private void test(double a, double b, double c,
                      double d, double expectedResult) {
        double arg5 = subtraction(a, b);
        double arg6 = divide(c,d);
        double actualResult = multiply(arg5,arg6);
        checkTestResult(expectedResult, actualResult);
    }
    private double subtraction(double leftArgument,
                               double rightArgument) {
        Argument a = new Argument(leftArgument);
        Argument b = new Argument(rightArgument);
        Subtraction subtraction = new Subtraction(a, b);
        subtraction.calculate();
        return subtraction.calculate();
    }
    private double divide(double leftArgument,
                          double rightArgument) {
        Argument c = new Argument(leftArgument);
        Argument d = new Argument(rightArgument);
        Divide divide = new Divide(c, d);
        divide.calculate();
        return divide.calculate();
    }
    private double multiply(double leftArgument,
                            double rightArgument ) {
        Argument arg5 = new Argument(leftArgument);
        Argument arg6 = new Argument(rightArgument);
        Multiply multiply = new Multiply(arg5, arg6);
        multiply.calculate();
        return multiply.calculate();
    }
    private void checkTestResult(double expectedResult,
                                 double actualResult){
        if (expectedResult == actualResult){
            System.out.println(" Test is passed (OK)");
        } else {
            System.out.println(" Test is FAILED ");
        }
    }

}
