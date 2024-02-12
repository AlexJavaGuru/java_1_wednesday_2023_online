package student_viktor_kuzmin.homework_lesson_7.level_6;

class CreditCardTest {
    public static void main(String[] args) {
        testWithdrawWithValidPinAndSufficientFunds();
        testWithdrawWithValidPinAndInsufficientFunds();
        testWithdrawWithInvalidPin();
        testDepositWithValidPinAndDebt();
        testDepositWithValidPinAndNoDebt();
        testDepositWithInvalidPin();
    }

    public static void testWithdrawWithValidPinAndSufficientFunds() {
        CreditCard card = new CreditCard("1234567890123456", 1234, 1000, 2000);
        card.withdraw(1234, 500);
        if (card.getBalance() == 500) {
            System.out.println("Test for withdraw with valid pin and sufficient funds passed.");
        } else {
            System.out.println("Test for withdraw with valid pin and sufficient funds failed.");
        }
    }

    public static void testWithdrawWithValidPinAndInsufficientFunds() {
        CreditCard card = new CreditCard("1234567890123456", 1234, 100, 0);
        card.withdraw(1234, 200);
        if (card.getBalance() == 100 && card.getDebt() == 100) {
            System.out.println("Test for withdraw with valid pin and insufficient funds passed.");
        } else {
            System.out.println("Test for withdraw with valid pin and insufficient funds failed.");
        }
    }

    public static void testWithdrawWithInvalidPin() {
        CreditCard card = new CreditCard("1234567890123456", 1234, 100, 0);
        card.withdraw(4321, 50);
        if (card.getBalance() == 100 && card.getDebt() == 0) {
            System.out.println("Test for withdraw with invalid pin passed.");
        } else {
            System.out.println("Test for withdraw with invalid pin failed.");
        }
    }

    public static void testDepositWithValidPinAndDebt() {
        CreditCard card = new CreditCard("1234567890123456", 1234, 0, 2000);
        card.setDebt(500);
        card.deposit(1234, 700);
        if (card.getDebt() == 200 && card.getBalance() == 500) {
            System.out.println("Test for deposit with valid pin and debt passed.");
        } else {
            System.out.println("Test for deposit with valid pin and debt failed.");
        }
    }

    public static void testDepositWithValidPinAndNoDebt() {
        CreditCard card = new CreditCard("1234567890123456", 1234, 0, 2000);
        card.deposit(1234, 1000);
        if (card.getBalance() == 1000) {
            System.out.println("Test for deposit with valid pin and no debt passed.");
        } else {
            System.out.println("Test for deposit with valid pin and no debt failed.");
        }
    }

    public static void testDepositWithInvalidPin() {
        CreditCard card = new CreditCard("1234567890123456", 1234, 0, 2000);
        card.deposit(4321, 500);
        if (card.getBalance() == 0) {
            System.out.println("Test for deposit with invalid pin passed.");
        } else {
            System.out.println("Test for deposit with invalid pin failed.");
        }
    }
}

