package teacher.lesson_11_srp.lessoncode.traderapp.before;

public class FraudDetectorTest {

    public static void main(String[] args) {
        testIsPokemonFraud();
        testNotPokemonFraud();
        testIsTransactionAmountFraud();
        testIsTransactionAmountNotFraud();
        testCityFraud();
        testCityNotFraud();
        testIsTransactionFromJamaika();
        testIsTransactionNotFromJamaika();
    }

    private static void testIsTransactionNotFromJamaika() {
        FraudDetector sum = new FraudDetector();
        Trader trader= new Trader("Alla", "Riga", "Malta");
        Transaction transaction = new Transaction(trader, 1000000);
        boolean result = sum.isFraud(transaction);
        check(result, "Is country Malta");
    }

    private static void testIsTransactionFromJamaika() {
        FraudDetector sum = new FraudDetector();
        Trader trader= new Trader("Alla", "Riga", "Jamaika");
        Transaction transaction = new Transaction(trader, 1000000);
        boolean result = sum.isFraud(transaction);
        check(!result, "Is country Jamaika");
    }

    private static void testIsTransactionAmountNotFraud() {
        FraudDetector sum = new FraudDetector();
        Trader trader= new Trader("Alla", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000000);
        boolean result = sum.isFraud(transaction);
        check(!result, "Less than 1 000 000");
    }

    private static void testIsTransactionAmountFraud() {
        FraudDetector sum = new FraudDetector();
        Trader trader= new Trader("Alla", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        boolean result = sum.isFraud(transaction);
        check(result, "Fraud Amount test");
    }

    public static void testIsPokemonFraud() {
        FraudDetector victim = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        boolean result = victim.isFraud(transaction);
        check(result, "Pokemon test");
    }

    public static void testNotPokemonFraud() {
        FraudDetector victim = new FraudDetector();
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        boolean result = victim.isFraud(transaction);
        check(!result, "Non Pokemon test");
    }

    public static void testCityFraud() {
        FraudDetector victim = new FraudDetector();
        Trader trader = new Trader("Alex", "Сидней", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        boolean result = victim.isFraud(transaction);
        check(result, "Сидней test");
    }

    public static void testCityNotFraud() {
        FraudDetector victim = new FraudDetector();
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        boolean result = victim.isFraud(transaction);
        check(!result, "Ne Сидней test");
    }

    private static void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed");
            System.out.println("Expected: true" + " but Actual: " + actualResult);
        }
    }
}
