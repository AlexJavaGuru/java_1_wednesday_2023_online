package teacher.lesson_11_srp.lessoncode.traderapp.after;

public class FraudRule1 extends FraudRule {

    FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }

}
