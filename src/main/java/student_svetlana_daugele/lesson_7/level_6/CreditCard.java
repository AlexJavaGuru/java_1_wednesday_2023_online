package student_svetlana_daugele.lesson_7.level_6;

class CreditCard {
    private String cardNumber;
    private int pin;
    private double balance;
    private double creditLimit;
    private double debt;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public CreditCard(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = 0;
        this.creditLimit = 0;
        this.debt = 0;
    }

    public void deposit(int enteredPin, double amount) {
        if (enteredPin != pin) {
            System.out.println("The entered PIN code is not correct.");
            return;
        }
        if (amount <= 0) {
            System.out.println("The entered data is not correct. " + "Entered data is zero or less that zero.");
            return;
        }
        if (debt > 0) {
            if (amount >= debt) {
                balance += (amount - debt);
                debt = 0;
                System.out.println("The current balance is " + balance);
                System.out.println("The debt is " + debt); System.out.println("The credit limit is " + creditLimit);
            } else {
                debt -= amount;
                System.out.println("The current balance is " + balance);
                System.out.println("The debt is " + debt); System.out.println("The credit limit is " + creditLimit);
            }
        } else {
            balance += amount;
            System.out.println("The current balance is " + balance);
            System.out.println("The debt is " + debt); System.out.println("The credit limit is " + creditLimit);
        }
    }

    public void withdraw(int enteredPin, double amount) {
        if (enteredPin != pin) {
            System.out.println("The entered PIN code is not correct.");
            return;
        }
        if (amount <= 0) {
            System.out.println("The entered data is not correct. Entered data is zero or less that zero.");
            return;
        }

        double availableFunds = balance + creditLimit - debt;

        if (amount > availableFunds || amount > balance) {


            if (balance >= amount) {
            balance -= amount;
            System.out.println("The balance is " + balance + ". The withdrawal amount  is " + amount + "The debt is " + debt + "The cedit limit is " + creditLimit);
            } else {
            debt -= (amount - balance);
            balance = 0;
            System.out.println("The balance is " + balance + ". The withdrawal amount  is " + amount + "The debt is " + debt + "The cedit limit is " + creditLimit);
        }


    }

    }
}

