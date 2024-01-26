package student_svetlana_daugele.lesson_11.level_4;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.fraudDetectorIsPokemon("Pokemon test", true);
        fraudDetectorTest.fraudDetectorNotPokemon("Not Pokemon test", false);
        fraudDetectorTest.fraudDetectorExceedAmount("Exceed amount Test", true);
        fraudDetectorTest.fraudDetectorNotExceedAmount("Exceed amount Test", false);
        fraudDetectorTest.fraudDetectorIsSidney("Sidney test", true);
        fraudDetectorTest.fraudDetectorNotSidney("Not Sidney test", false);
        fraudDetectorTest.fraudDetectorNotJamaica("Not Jamaica test", false);
        fraudDetectorTest.fraudDetectorJamaica("Jamaica test", true);
        fraudDetectorTest.fraudDetectorGermanyThreshold1("Germany Threshold (amount exceed 1000)test", true);
        fraudDetectorTest.fraudDetectorGermanyThreshold2("Germany Threshold (amount not exceed 1000) test", false);
    }

    private void fraudDetectorGermanyThreshold1(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction t = new Transaction(trader, 1001);
        boolean result = fraudDetector.isFraud(t);
        isFraudTest(testName, result, expectedResult);
    }

    private void fraudDetectorGermanyThreshold2(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction t = new Transaction(trader, 1000);
        boolean result = fraudDetector.isFraud(t);
        isFraudTest(testName, result, expectedResult);
    }

    private void fraudDetectorJamaica(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Kingston", "Jamaica");
        Transaction t = new Transaction(trader, 1000000);
        boolean result = fraudDetector.isFraud(t);
        isFraudTest(testName, result, expectedResult);
    }

    private void fraudDetectorNotJamaica(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 1000000);
        boolean result = fraudDetector.isFraud(t);
        isFraudTest(testName, result, expectedResult);
    }

    private void fraudDetectorNotSidney(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 1000000);
        boolean result = fraudDetector.isFraud(t);
        isFraudTest(testName, result, expectedResult);
    }

    private void fraudDetectorIsSidney(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Sidney", "Latvia");
        Transaction t = new Transaction(trader, 1000000);
        boolean result = fraudDetector.isFraud(t);
        isFraudTest(testName, result, expectedResult);

    }

    private void fraudDetectorNotExceedAmount(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 1000000);
        boolean result = fraudDetector.isFraud(t);
        isFraudTest(testName, result, expectedResult);
    }

    private void fraudDetectorExceedAmount(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 1000000001);
        boolean result = fraudDetector.isFraud(t);
        isFraudTest(testName, result, expectedResult);
    }

    private void fraudDetectorNotPokemon(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 100000);
        boolean result = fraudDetector.isFraud(t);
        isFraudTest(testName, result, expectedResult);
    }

    private void fraudDetectorIsPokemon(String testName, boolean expectedResult) {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 100000);
        boolean result = fraudDetector.isFraud(t);
        isFraudTest(testName, result, expectedResult);
    }

    private void isFraudTest(String testName, boolean result, boolean expectedResult) {
        if (result == expectedResult) {
            System.out.println(testName + " is PASSED");
        } else {
            System.out.println(testName + " is FALSE");
        }

    }
}

