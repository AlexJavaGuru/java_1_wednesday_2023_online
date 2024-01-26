package student_svetlana_daugele.lesson_11.level_5_and_6;

abstract class FraudRule {
    private String ruleName;

    public String getRuleName() {
        return ruleName;
    }

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}
