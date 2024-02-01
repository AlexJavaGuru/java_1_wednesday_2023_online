package student_svetlana_daugele.lesson_11.level_1_intern;

class Safe2 {
    private String pinCode2;
    private double moneyAmountInSafe;


    public Safe2(String pinCode2, double moneyAmountInSafe) {
        this.pinCode2 = pinCode2;
        this.moneyAmountInSafe = moneyAmountInSafe;
    }

    public String getPinCode2() {
        return pinCode2;
    }

    public void setPinCode2(String pinCode2) {
        this.pinCode2 = pinCode2;
    }

    public double getMoneyAmountInSafe() {
        return moneyAmountInSafe;
    }

    public void setMoneyAmountInSafe(double moneyAmountInSafe) {
        this.moneyAmountInSafe = moneyAmountInSafe;
    }

    public void putMoney(String enteredPinCode2, double putMoneyAmount) {
        if (ifPinCodeOk(enteredPinCode2)) {
            moneyAmountInSafe += putMoneyAmount;
            System.out.println(" Remaining balance: " + moneyAmountInSafe);
        } else {
            System.out.println("Invalid PIN code.");

        }
    }

    public void getMoney(String enteredPinCode2, double getMoneyAmount) {

        if (ifPinCodeOk(enteredPinCode2) && getMoneyAmount <= moneyAmountInSafe) {
            moneyAmountInSafe -= getMoneyAmount;
            System.out.println("Money withdrawn successfully. Remaining balance: " + moneyAmountInSafe);
        } else {
            System.out.println("Invalid PIN code or insufficient funds.");

        }
    }

    private boolean ifPinCodeOk(String enteredPinCode2) {
        return pinCode2.equals(enteredPinCode2);
    }
}

