package teacher.lesson_11_srp.lessoncode.traderapp.after;

import java.util.ArrayList;
import java.util.List;

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
        FraudDetector sum = new FraudDetector(initRules());
        Trader trader= new Trader("Alla", "Riga", "Malta");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetectionResult result = sum.isFraud(transaction);
        check(!result.isFraud(), "Is country Malta");
    }

    private static void testIsTransactionFromJamaika() {
        FraudDetector sum = new FraudDetector(initRules());
        Trader trader= new Trader("Alla", "Riga", "Jamaika");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetectionResult result = sum.isFraud(transaction);
        check(result.isFraud(), "Is country Jamaika");
    }

    private static void testIsTransactionAmountNotFraud() {
        FraudDetector sum = new FraudDetector(initRules());
        Trader trader= new Trader("Alla", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetectionResult result = sum.isFraud(transaction);
        check(!result.isFraud(), "Less than 1 000 000");
    }

    private static void testIsTransactionAmountFraud() {
        FraudDetector sum = new FraudDetector(initRules());
        Trader trader= new Trader("Alla", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult result = sum.isFraud(transaction);
        check(result.isFraud(), "Fraud Amount test");
    }

    public static void testIsPokemonFraud() {
        FraudDetector victim = new FraudDetector(initRules());
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = victim.isFraud(transaction);
        check(result.isFraud(), "Pokemon test");
    }

    public static void testNotPokemonFraud() {
        FraudDetector victim = new FraudDetector(initRules());
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = victim.isFraud(transaction);
        check(!result.isFraud(), "Non Pokemon test");
    }

    public static void testCityFraud() {
        FraudDetector victim = new FraudDetector(initRules());
        Trader trader = new Trader("Alex", "Сидней", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = victim.isFraud(transaction);
        check(result.isFraud(), "Сидней test");
    }

    public static void testCityNotFraud() {
        FraudDetector victim = new FraudDetector(initRules());
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = victim.isFraud(transaction);
        check(!result.isFraud(), "Ne Сидней test");
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

    private static List<FraudRule> initRules() {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1("Is Pokemon"));
        fraudRules.add(new FraudRule2("More Than 1 000 000"));
        fraudRules.add(new FraudRule3("Is Sideny"));
        fraudRules.add(new FraudRule4("Is Jamaika"));
        fraudRules.add(new FraudRule5("Is Germany AND More Than 1000"));
        return fraudRules;
    }
}
