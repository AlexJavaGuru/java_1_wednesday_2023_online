package student_slava_subacius.lesson_4_3;

import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter number3: ");
        int number3 = scanner.nextInt();

        int maxNumber ;

        if (number1 >= number2 && number1 >= number3) {
             maxNumber = number1;
        } else if (number2 >= number1 && number2 >= number3) {
             maxNumber = number2;
        } else {
             maxNumber = number3;
        }
        System.out.println("The maximum number is: " + maxNumber);
    }
}