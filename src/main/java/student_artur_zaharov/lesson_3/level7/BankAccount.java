package student_artur_zaharov.lesson_3.level7;

class BankAccount {
    String owner;
    int money;

    BankAccount(int money, String owner) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}


