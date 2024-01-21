package student_artur_zaharov.lesson_7.level_6;

public class TransactionResult {


    private Double balance;
    private Double debt;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

    public TransactionResult(Double balance, Double debt) {
        this.balance = balance;
        this.debt = debt;
    }
}
