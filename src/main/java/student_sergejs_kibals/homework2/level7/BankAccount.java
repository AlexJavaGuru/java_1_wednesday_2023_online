package student_sergejs_kibals.homework2.level7;

class BankAccount {

    String owner;
    int money;

    BankAccount(String ownersName, int moneyAmount) {
        this.owner = ownersName;
        this.money = moneyAmount;
    }

    String getOwner() {
        return owner;
    }

    int getMoney() {
        return money;
    }
}
