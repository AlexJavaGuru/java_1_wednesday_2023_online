package teacher.lesson_11_srp.lessoncode.traderapp.after;

public abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction transaction);

    public String getRuleName() {
        return ruleName;
    }
}
