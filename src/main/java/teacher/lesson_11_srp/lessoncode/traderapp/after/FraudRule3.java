package teacher.lesson_11_srp.lessoncode.traderapp.after;

public class FraudRule3 extends FraudRule  {

    FraudRule3(String ruleName){
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Сидней");
    }
}
