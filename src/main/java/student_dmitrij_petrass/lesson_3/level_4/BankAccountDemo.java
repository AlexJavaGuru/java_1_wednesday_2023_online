package student_dmitrij_petrass.lesson_3.level_4;

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Dmitrijs", "Petrass", 5000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.moneyAmount;
        System.out.println("Owner first name =" + ownerFirstName);
        System.out.println("Owner last name =" + ownerLastName);
        System.out.println("Money amount =" + moneyAmount);

    }
}
