package student_slava_subacius.lesson_4;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " - even.");
        } else

            System.out.println("Number " + number + " - odd.");
        }
    }


