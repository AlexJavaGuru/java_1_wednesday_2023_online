package student_viktor_kuzmin.homework_lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter integer2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter integer3: ");
        int num3 = scanner.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("the biggest is " + num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("the biggest is " + num2);
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println("the biggest is " + num3);
        } else if ((num1 == num2) && (num1 > num3)) {
            System.out.println("the biggest is " + num1);
        } else if ((num1 == num3) && (num1 > num2)) {
            System.out.println("the biggest is " + num1);
        } else if ((num2 == num3) && (num3 > num1)) {
            System.out.println("the biggest is " + num2);
        } else {
            System.out.println("the biggest is " + num2);
        }
        scanner.close();
    }
}
