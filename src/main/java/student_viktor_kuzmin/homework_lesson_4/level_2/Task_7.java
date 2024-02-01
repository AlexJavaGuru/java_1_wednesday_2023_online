package student_viktor_kuzmin.homework_lesson_4.level_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter integer2: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }scanner.close();
    }
}
