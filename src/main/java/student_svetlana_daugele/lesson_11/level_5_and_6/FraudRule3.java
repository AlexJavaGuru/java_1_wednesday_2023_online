package student_svetlana_daugele.lesson_11.level_5_and_6;

class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sidney");
    }

}
