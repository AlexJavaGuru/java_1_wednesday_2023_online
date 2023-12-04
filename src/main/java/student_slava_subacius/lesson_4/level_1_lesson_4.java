package student_slava_subacius.lesson_4;

import java.util.Scanner;

public class level_1_lesson_4 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.print("Enter an integer: ");

            if (number > 0) {
                System.out.println("Number is positive");
            } else if (number < 0) {
                System.out.println("Negative number");
            } else {
                System.out.println("Number equal to zero");
            }
    }
}
