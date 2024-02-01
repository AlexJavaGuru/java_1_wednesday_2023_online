package student_svetlana_daugele.lesson_11.level_5_and_6;

import java.util.List;

class FraudDetectorDemo {
    public static void main(String[] args) {
        FraudRule[] fraudRules = {
                new FraudRule1("Is Pokemon"),
                new FraudRule2("More Than 1 000 000"),
                new FraudRule3("Is Sidney"),
                new FraudRule4("Is Jamaica"),
                new FraudRule5("Is Germany AND More Than 1000"),
        };

        FraudDetector fraudDetector = new FraudDetector(List.of(fraudRules));
        Transaction transaction = new Transaction(new Trader("Pokemon", "Sidney", "Jamaica"), 1000001);
        System.out.println(transaction.toString());
        fraudDetector.isFraud(transaction);

    }

}
