package student_viktor_kuzmin.homework_lesson_7.level_6;

class CreditCard {

    private String cardNumber;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double debt;

    public CreditCard(String cardNumber, int pinCode, double balance, double creditLimit, double debt) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLimit = creditLimit;
        this.debt = 0;
    }

    public CreditCard(String number, int pinCode, int balance, int creditLimit) {
    }


    public void deposit(int enteredPin, double amount) {
        if (checkPin(enteredPin)) {
            if (debt > 0) {
                if (amount >= debt) {
                    amount -= debt;
                    debt = 0;
                } else {
                    debt -= amount;
                    amount = 0;
                }
            }
            balance += amount;
            System.out.println("Funds successfully credited: " + amount);
        } else {
            System.out.println("Invalid PIN code.");
        }
    }


    public void withdraw(int enteredPin, double amount) {
        if (checkPin(enteredPin)) {
            double availableFunds = balance + creditLimit - debt;
            if (amount <= availableFunds) {
                if (amount <= balance) {
                    balance -= amount;
                } else {
                    double remainingAmount = amount - balance;
                    balance = 0;
                    debt += remainingAmount;
                }
                System.out.println("Funds were successfully withdrawn: " + amount);
            } else {
                System.out.println("\n" + "There are not enough funds on the card.");
            }
        } else {
            System.out.println("Invalid PIN code.");
        }
    }


        public boolean checkPin(int enteredPin) {
            return this.pinCode == enteredPin;
        }




    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getDebt() {
        return debt;
    }
}
