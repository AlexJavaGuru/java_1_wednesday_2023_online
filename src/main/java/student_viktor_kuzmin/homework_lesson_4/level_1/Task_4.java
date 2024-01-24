package student_viktor_kuzmin.homework_lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        scanner.close();


    }
}
