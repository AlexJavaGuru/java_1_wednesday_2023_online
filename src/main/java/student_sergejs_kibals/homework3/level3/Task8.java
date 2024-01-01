package student_sergejs_kibals.homework3.level2;

import java.util.Scanner;

class Task8 {

    public static void main(String[] args) {

        System.out.println("Please, enter the numbers:");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if ((number1 == number2) && (number1 == number3)) {
            System.out.println("All entered numbers are equal!");
        } else if ((number1 != number2) && (number2 != number3)) {
            System.out.println("All entered numbers are different!");
        } else {
            System.out.println("Neither all are equal or different!");
        }
    }
}