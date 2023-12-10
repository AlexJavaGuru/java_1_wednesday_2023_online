package student_slava_subacius.lesson_4;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("Small number " + firstNumber);
        } else if (secondNumber < firstNumber) {
            System.out.println("Small number " + secondNumber);
        } else {

            System.out.println("Number are equal");
        }
    }

}