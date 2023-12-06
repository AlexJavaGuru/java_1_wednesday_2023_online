package student_slava_subacius.lesson_4_3;

import java.util.Scanner;

public class CompareThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Еnter the first number");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number");
        int number3 =scanner.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        } else if (number1 != number2 && number2 != number3 && number1 != number3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
