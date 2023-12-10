package student_dmitrij_petrass.lesson_4.level_1;

import java.io.File;
import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0){
            System.out.println("Negative number");
        }
    }
}