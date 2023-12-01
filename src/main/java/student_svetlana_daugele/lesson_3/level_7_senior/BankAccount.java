package student_svetlana_daugele.lesson_3.level_7_senior;

public class BankAccount {
    public String owner;
    public int money;

    BankAccount(String owner, int money) {
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
