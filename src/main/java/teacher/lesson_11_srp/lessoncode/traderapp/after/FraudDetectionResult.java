package teacher.lesson_11_srp.lessoncode.traderapp.after;

import java.util.List;

public class FraudDetectionResult {

    private boolean isFraud;
    private List<String> ruleNames;

    public FraudDetectionResult(boolean isFraud, List<String> ruleNames) {
        this.isFraud = isFraud;
        this.ruleNames = ruleNames;
    }

    public boolean isFraud() {
        return isFraud;
    }

    public List<String> getRuleNames() {
        return ruleNames;
    }
}
