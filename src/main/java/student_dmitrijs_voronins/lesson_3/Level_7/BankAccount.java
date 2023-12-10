package student_dmitrijs_voronins.lesson_3.Level_7;

class BankAccount {

    String owner;
    int money;

    BankAccount(int moneyAmount , String ownerFirstName) {
        this.money = moneyAmount;
        this.owner = ownerFirstName;
    }

    String getOwner() {

        return this.owner;
    }

    public String getMoney() {
       return String.valueOf(this.money);
    }

    //void getMoney(int money) {

      ///  this.money = money;


}

