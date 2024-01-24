package teacher.lesson_11_srp.lessoncode.traderapp.after;

public class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return (transaction.getTrader().getCountry().equals("Германии") &&
                transaction.getAmount() > 1000);
    }
}
