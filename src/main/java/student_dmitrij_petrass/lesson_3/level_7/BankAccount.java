package student_dmitrij_petrass.lesson_3.level_7;

class BankAccount {
    private String ownerFirstName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}
