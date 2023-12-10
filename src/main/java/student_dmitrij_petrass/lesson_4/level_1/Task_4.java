package student_dmitrij_petrass.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Please enter integer...");
        int value = scanner.nextInt();


        if (value % 2 == 0) {
            System.out.println("Even number");

        } else if (value % 2 == 1) {
            System.out.println("Not Even number");
        }

    }
}