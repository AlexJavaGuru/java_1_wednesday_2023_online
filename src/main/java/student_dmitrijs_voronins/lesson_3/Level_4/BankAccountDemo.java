package student_dmitrijs_voronins.lesson_3.Level_4;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Dmitrijs","Voroņins",200);
        String ownerFirstName = bankAccount.getOwnreFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int moneyAount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAount);
    }
}
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