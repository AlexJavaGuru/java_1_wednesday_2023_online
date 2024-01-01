package student_sergejs_kibals.homework3.level2;

import java.util.Scanner;

class Task7 {

    public static void main(String[] args) {

        System.out.println("Please, enter the numbers:");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Entered numbers are equal!");
        } else {
            System.out.println("Entered numbers are different!");
        }
    }
}
