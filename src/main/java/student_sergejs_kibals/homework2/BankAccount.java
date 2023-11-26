package student_sergejs_kibals.homework2;

class BankAccount {

    String ownerFirstname;
    String ownerLastname;
    int moneyAmmount;

    BankAccount(String ownerFirstname, String ownerLastname, int moneyAmmount) {
        this.ownerFirstname = ownerFirstname;
        this.ownerLastname = ownerLastname;
        this.moneyAmmount = moneyAmmount;
    }

    String getOwnerFirstname() {
        return this.ownerFirstname;
    }
    String getOwnerLastname(){
        return this.ownerLastname;
    }
    int getMoneyAmmount(){
        return this.moneyAmmount;
    }
}
