package student_dmitrij_petrass.lesson_3.level_7;

import java.util.SortedMap;

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        int moneyAmount = bankAccount.getMoneyAmount();

        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
