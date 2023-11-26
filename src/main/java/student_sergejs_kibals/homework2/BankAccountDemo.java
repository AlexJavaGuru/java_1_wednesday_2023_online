package student_sergejs_kibals.homework2;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);

        String ownerFirstname = bankAccount.getOwnerFirstname();
        String ownerLastname = bankAccount.getOwnerLastname();
        int moneyAmmount = bankAccount.getMoneyAmmount();

        System.out.println("Owner first name = " + ownerFirstname);
        System.out.println("Owner last name = " + ownerLastname);
        System.out.println("Money amount = " + moneyAmmount);
    }
}