package student_sergejs_kibals.homework3.level1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Please, enter the number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Your number is positive!");
        } else if (number < 0) {
            System.out.println("Your number is negative!");
        } else {
            System.out.println("The number 0 is neither positive nor negative!");
        }
    }
}
