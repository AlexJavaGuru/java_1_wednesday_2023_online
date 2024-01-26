package student_svetlana_daugele.lesson_11.level_5_and_6;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000);
    }

}
