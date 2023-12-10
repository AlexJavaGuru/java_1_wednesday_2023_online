package student_slava_subacius.lesson_4;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second integer: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Highest number: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Highest number: " + secondNumber);
        } else {
            System.out.println("Нumbers are equal");
        }
    }
}