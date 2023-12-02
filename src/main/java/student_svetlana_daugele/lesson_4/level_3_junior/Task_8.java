package student_svetlana_daugele.lesson_4.level_3_junior;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first integer number: ");
        int number1 = scanner.nextInt();

        System.out.print("Please enter the second integer number: ");
        int number2 = scanner.nextInt();

        System.out.print("Please enter the third integer number: ");
        int number3 = scanner.nextInt();

        if (number1 == number2 && number3 == number2) {
            System.out.print("All numbers are equal");
        } else if (number1 != number2 && number1 != number3 && number2 != number3) {
            System.out.print("All numbers are different");
        } else {
            System.out.print("Neither all are equal or different");
        }
    }
}
/*
Write a Java program that accepts three numbers and prints:
 -"All numbers are equal" if all three numbers are equal,
 - "All numbers are different" if all three numbers are different
 - "Neither all are equal or different" otherwise.

 */