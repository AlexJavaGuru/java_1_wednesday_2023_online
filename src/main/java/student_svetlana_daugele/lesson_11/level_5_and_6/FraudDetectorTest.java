package student_svetlana_daugele.lesson_11.level_5_and_6;


import java.util.ArrayList;
import java.util.List;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.fraudDetectorResultTest1("Pokemon test", true);
        fraudDetectorTest.fraudDetectorResultTest2("Not Pokemon test", false);
        fraudDetectorTest.fraudDetectorResultTest3("1000000 threshold test", true);
        fraudDetectorTest.fraudDetectorResultTest4("Not 1000000 threshold test", false);
        fraudDetectorTest.fraudDetectorResultTest5("Sidney test", true);
        fraudDetectorTest.fraudDetectorResultTest6("Not Sidney test", false);
        fraudDetectorTest.fraudDetectorResultTest7("Jamaica test", true);
        fraudDetectorTest.fraudDetectorResultTest8("Not Jamaica test", false);
        fraudDetectorTest.fraudDetectorResultTest9("Germany and 1000 threshold test", true);
        fraudDetectorTest.fraudDetectorResultTest10("Not Germany and 1000 threshold test", false);
    }

    public void fraudDetectorResultTest1(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector(initRules());
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        isFraudTest(testName, result.isFraud(), expectedResult);

    }

    public void fraudDetectorResultTest2(String testName, boolean expectedResult) {

        FraudDetector fraudDetector = new FraudDetector(initRules());
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        isFraudTest(testName, result.isFraud(), expectedResult);

    }

    public void fraudDetectorResultTest3(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector(initRules());
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        isFraudTest(testName, result.isFraud(), expectedResult);

    }

    public void fraudDetectorResultTest4(String testName, boolean expectedResult) {

        FraudDetector fraudDetector = new FraudDetector(initRules());
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        isFraudTest(testName, result.isFraud(), expectedResult);

    }

    public void fraudDetectorResultTest5(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector(initRules());
        Trader trader = new Trader("Pokemon", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        isFraudTest(testName, result.isFraud(), expectedResult);

    }

    public void fraudDetectorResultTest6(String testName, boolean expectedResult) {

        FraudDetector fraudDetector = new FraudDetector(initRules());
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        isFraudTest(testName, result.isFraud(), expectedResult);

    }

    public void fraudDetectorResultTest7(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector(initRules());
        Trader trader = new Trader("Pokemon", "Sidney", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        isFraudTest(testName, result.isFraud(), expectedResult);

    }

    public void fraudDetectorResultTest8(String testName, boolean expectedResult) {

        FraudDetector fraudDetector = new FraudDetector(initRules());
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        isFraudTest(testName, result.isFraud(), expectedResult);

    }

    public void fraudDetectorResultTest9(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector(initRules());
        Trader trader = new Trader("Pokemon", "Sidney", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        isFraudTest(testName, result.isFraud(), expectedResult);

    }

    public void fraudDetectorResultTest10(String testName, boolean expectedResult) {

        FraudDetector fraudDetector = new FraudDetector(initRules());
        Trader trader = new Trader("Alex", "Riga", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        isFraudTest(testName, result.isFraud(), expectedResult);

    }

    private void isFraudTest(String testName, boolean result, boolean expectedResult) {
        if (result == expectedResult) {
            System.out.println(testName + " is PASSED");
        } else {
            System.out.println(testName + " is FALSE");
        }

    }

    private static List<FraudRule> initRules() {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1("Is Pokemon"));
        fraudRules.add(new FraudRule2("More Than 1 000 000"));
        fraudRules.add(new FraudRule3("Is Sidney"));
        fraudRules.add(new FraudRule4("Is Jamaica"));
        fraudRules.add(new FraudRule5("Is Germany AND More Than 1000"));
        return fraudRules;
    }
}
