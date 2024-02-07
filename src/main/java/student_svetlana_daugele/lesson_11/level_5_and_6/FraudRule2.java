package student_svetlana_daugele.lesson_11.level_5_and_6;

class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;

    }

}
