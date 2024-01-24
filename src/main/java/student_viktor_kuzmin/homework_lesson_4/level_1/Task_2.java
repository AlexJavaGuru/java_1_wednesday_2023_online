package student_viktor_kuzmin.homework_lesson_4.level_1;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number <0) {
            System.out.println("Number is negative");
        } else {
            System.out.println(" Number is equals 0");
        }scanner.close();
    }
}
