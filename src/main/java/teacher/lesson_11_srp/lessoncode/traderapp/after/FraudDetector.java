package teacher.lesson_11_srp.lessoncode.traderapp.after;

import java.util.ArrayList;
import java.util.List;

//- Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.
//- Rule 2: все транзакции на сумму больше 1 000 000 должны быть отклонены.
//- Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.
//- Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.
//- Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.
class FraudDetector {

    private List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

//FraudDetectionResult
    FraudDetectionResult isFraud(Transaction transaction) {
        List<String> fraudRuleNames = new ArrayList<>();
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                fraudRuleNames.add(fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(!fraudRuleNames.isEmpty(), fraudRuleNames);
    }
}
