package student_svetlana_daugele.lesson_11.level_1_intern;

import java.util.Scanner;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.moneyInSafe = 12.1;
        safe.pinCode = "1234";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the PIN code.");
        String expectedPinCode = scanner.nextLine();
        if (expectedPinCode.equals(safe.pinCode)) {
            System.out.println("The PIN code is " + safe.pinCode + ".");
            System.out.println("There are " + safe.moneyInSafe + " Eur in safe");
        } else {
            System.out.println("The PIN code " + expectedPinCode + " is not correct.");
        }

    }
}
