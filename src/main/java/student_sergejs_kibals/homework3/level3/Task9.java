package student_sergejs_kibals.homework3.level2;

import java.util.Scanner;

class Task9 {

    public static void main(String[] args) {

        System.out.println("Please, enter the numbers:");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if ((number1 < number2) && (number2 < number3)) {
            System.out.println("Entered numbers are in increasing order!");
        } else if ((number1 > number2) && (number2 > number3)) {
            System.out.println("Entered numbers are in decreasing order!");
        } else {
            System.out.println("Neither increasing or decreasing order!");
        }
    }
}