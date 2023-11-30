package student_artur_zaharov.lesson_3.level7;

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100000, "Viktor");
        String owner = bankAccount.getOwner();
        int money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}

