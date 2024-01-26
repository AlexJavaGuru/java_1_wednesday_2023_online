package student_svetlana_daugele.lesson_11.level_5_and_6;

import java.util.List;

class FraudDetectionResult {
    private boolean isFraud;
    private List<String> ruleNames;

    public FraudDetectionResult(boolean isFraud, List<String> ruleNames) {
        this.isFraud = isFraud;
        this.ruleNames = ruleNames;
    }

    public boolean isFraud() {
        return isFraud;
    }

}
