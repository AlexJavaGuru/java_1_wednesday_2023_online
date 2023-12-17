package student_sergejs_kibals.homework3.level1;

import java.util.Scanner;

class Task4 {

    public static void main(String[] args) {

        System.out.println("Please, enter the number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Entered number is Even!");
        } else {
            System.out.println("Entered number is Odd!");
        }
    }
}