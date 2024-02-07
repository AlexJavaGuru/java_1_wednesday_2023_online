package student_viktor_kuzmin.homework_lesson_5.level_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {

        int[] myArray = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter cell number " + i + ": ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Cells numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Cell " + i + ": " + myArray[i]);
        }

        scanner.close();
    }
}
