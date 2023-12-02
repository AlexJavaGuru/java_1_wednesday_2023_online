package student_svetlana_daugele.lesson_4.level_3_junior;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter the first integer number: ");
    int number1 = scanner.nextInt();

    System.out.print("Please enter the second integer number: ");
    int number2 = scanner.nextInt();

    System.out.print("Please enter the third integer number: ");
    int number3 = scanner.nextInt();

    if (number1 < number2 && number2 < number3) {
        System.out.print("increasing");
    }
    else if (number1 > number2 && number2 > number3) {
        System.out.print("decreasing");
    }
    else {
        System.out.print("Neither increasing or decreasing order");
    }
}
}
/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
*/
