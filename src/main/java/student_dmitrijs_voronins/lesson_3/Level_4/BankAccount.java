package student_dmitrijs_voronins.lesson_3.Level_4;

class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    public BankAccount(String ownreFirstName,
                       String ownerLastName,
                       int moneyAmount){
        this.ownerFirstName = ownreFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }
    String getOwnreFirstName(){
        return this.ownerFirstName;
    }
    String getOwnerLastName(){
        return this.ownerLastName;
    }
    int getMoneyAmount(){
        return this.moneyAmount;
    }
}
//Найти ошибку в коде.
//Исправить и запустить программу.
//
//class BankAccount {
//
//    String ownerFirstName;
//    String ownerLastName;
//    int moneyAmount;
//
//    BankAccount(String ownerFirstName,
//                String ownerLastName
//                int moneyAmount) {
//        this.ownerFirstName = ownerFirstName;
//        this.ownerLastName = ownerLastName;
//        this.money = money;
//    }
//
//    String getOwnerFirstName( {
//        return this.ownerFirstName
//    }
//
//    String getOwnerLastName) {
//        return this.ownerFirstName
//    }
//
//    void getMoneyAmount() {
//        return this.moneyAmount;
//    }
//
//}
//
//class BankAccountDemo {
//
//    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
//        String ownerFirstName = bankAccount.getOwnerFirstName();
//        String ownerFirstName = bankAccount.getOwnerLastName();
//        String moneyAmount = bankAccount.getMoneyAmount();
//        System.out.println("Owner first name = " + ownerFirstName);
//        System.out.println("Owner last name = " + ownerLastName);
//        System.out.println("Money amount = " + moneyAmount);
//    }
//
//}