package student_viktor_kuzmin.homework_lesson_4.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter number2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter number3: ");
        double num3 = scanner.nextDouble();

        if ((num1 < num2) && (num2 < num3)) {
            System.out.println("increasing");
        } else if ((num1 > num2) && (num2 > num3)) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

    }
}


