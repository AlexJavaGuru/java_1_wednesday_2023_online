package student_sergejs_kibals.homework3.level2;

import java.util.Scanner;

class Task10 {

    public static void main(String[] args) {

        System.out.println("Please, enter the numbers:");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if ((number1 > number2) && (number1 > number3)) {
            System.out.println("The largest number is " + number1 + "!");
        } else if ((number2 > number1) && (number2 > number3)) {
            System.out.println("The largest number is " + number2 + "!");
        } else if ((number3 > number1) && (number3 > number2)) {
            System.out.println("The largest number is " + number3 + "!");
        } else {
            System.out.println("All entered numbers are equal!");
        }
    }
}