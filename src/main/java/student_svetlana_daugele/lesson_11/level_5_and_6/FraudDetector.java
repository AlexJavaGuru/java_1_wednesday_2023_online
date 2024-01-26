package student_svetlana_daugele.lesson_11.level_5_and_6;

import java.util.ArrayList;
import java.util.List;

class FraudDetector {
    private List<FraudRule> fraudRules = new ArrayList();


    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        List<String> fraudRulesNames = new ArrayList<>();

        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                fraudRulesNames.add(fraudRule.getRuleName());

            }

        }
        System.out.println("Detected fraud cases: " + fraudRulesNames);

        return new FraudDetectionResult(!fraudRulesNames.isEmpty(), fraudRulesNames);

    }


}