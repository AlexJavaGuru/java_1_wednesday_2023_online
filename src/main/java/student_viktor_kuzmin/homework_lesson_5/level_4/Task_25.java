package student_viktor_kuzmin.homework_lesson_5.level_4;

import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scanner.nextInt();

        int[] userArray = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter number for cell Nr" + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i = 0; i < length; i++) {
            System.out.println("Cell value " + i + ": " + userArray[i]);
        }

    }
}
