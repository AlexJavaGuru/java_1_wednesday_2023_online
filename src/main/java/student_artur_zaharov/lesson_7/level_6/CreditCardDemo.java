package student_artur_zaharov.lesson_7.level_6;

public class CreditCardDemo {

    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(12345, 1234);
        card1.setCreditLimit(100);
        card1.deposit(1234,100);
        System.out.println(card1.getBalance());
        System.out.println(card1.getDebt());
        card1.withdraw(1234, 300);
        System.out.println(card1.getBalance());
        System.out.println(card1.getDebt());
        card1.withdraw(1234, 200);
        System.out.println(card1.getBalance());
        System.out.println(card1.getDebt());
        card1.deposit(1234,1000);
        System.out.println(card1.getBalance());
        System.out.println(card1.getDebt());
        card1.deposit(2222,1000);
        System.out.println(card1.getBalance());
        System.out.println(card1.getDebt());
        card1.withdraw(1234, 300);
        System.out.println(card1.getBalance());
        System.out.println(card1.getDebt());


    }
}
