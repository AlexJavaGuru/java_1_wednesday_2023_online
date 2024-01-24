package teacher.lesson_11_srp.lessoncode.traderapp.after;

public class FraudRule2 extends FraudRule{

    FraudRule2(String ruleName){
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}
