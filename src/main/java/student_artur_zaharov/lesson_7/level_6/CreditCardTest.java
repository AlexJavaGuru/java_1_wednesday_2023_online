package student_artur_zaharov.lesson_7.level_6;



public class CreditCardTest {

    public static void main(String[] args) {
        testDeposit();
        testWithdraw();
    }

    public static void testDeposit() {
        CreditCard card = new CreditCard(12345, 1234);
        int expectedResult = 100;
        card.setCreditLimit(100);
        card.deposit(1234,100);
        card.withdraw(1234, 300);
        Double realResult = card.getBalance();
        if  (realResult == expectedResult) {
            System.out.println("Test testDeposit = passed" );
        }else {
            System.out.println("Test testDeposit = failed" );
        }


    }


    public static void testWithdraw() {
        CreditCard card = new CreditCard(12345, 1234);
        double expectedResultDebt = 0;
        double expectedResultBalance = 900.0;
        card.setCreditLimit(100);
        card.deposit(1234,100);
        card.withdraw(1234, 300);
        card.withdraw(1234, 200);
        card.deposit(1234,1000);
        card.deposit(2222,1000);

        double realResultDebt = card.getDebt();
        double realResultBalance = card.getBalance();
        check(expectedResultDebt, realResultDebt, "testWithdraw");
        check(expectedResultBalance, realResultBalance, "testWithdraw");

    }

    private static void check(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " has PASSED!!");
        } else {
            System.out.println(testName + " has FAILED!!");
        }
    }
    private static void check (double expectedResult, double realResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println("Test name " + testName + " = OK");
        } else {
            System.out.println("Test name " + testName + " = FAIL");
            System.out.println("Expected: " + expectedResult + "of test" + testName + "but Actual: " + realResult);
        }
    }
}