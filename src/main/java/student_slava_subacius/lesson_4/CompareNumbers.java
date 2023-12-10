package student_slava_subacius.lesson_4;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Еnter the first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Еnter the second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }


    }
}
