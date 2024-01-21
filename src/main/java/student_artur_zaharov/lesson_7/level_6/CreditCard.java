package student_artur_zaharov.lesson_7.level_6;

public class CreditCard {
    private int cardNumber;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double debt;

    public CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLimit = 0;
        this.debt = 0;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public TransactionResult deposit(int enteredPin, double amount) {
        if (enteredPin != pinCode) {
            System.out.println("Nevernij PIN kod");
            return null;
        }

        if (debt > 0) {
            if (amount >= debt) {
                balance = amount - debt;
                debt = 0;
                return new TransactionResult(balance, debt);
            } else {
                debt = debt - amount;
                return new TransactionResult(null, debt);
            }

        }
        if (debt == 0) {
            balance = balance + amount;
            return new TransactionResult(balance, debt);
        }
        return null;
    }


    public TransactionResult withdraw(int enteredPin, double amount) {
        if (enteredPin != pinCode) {
            System.out.println("Nevernij PIN kod");
            return null;
        }

        double availableFunds = balance + creditLimit - debt;
        if (amount > availableFunds) {
            System.out.println("Nedostatochno deneznih sredstv");
            return null;
        }
        if (balance >= amount) {
            balance = balance - amount;
            return new TransactionResult(balance, null);

        } else {
            debt = amount - balance;
            balance = 0;
            return new TransactionResult(balance, debt);

        }
    }

    public double getBalance() {
        return balance;
    }

    public double getDebt() {
        return debt;
    }
}

