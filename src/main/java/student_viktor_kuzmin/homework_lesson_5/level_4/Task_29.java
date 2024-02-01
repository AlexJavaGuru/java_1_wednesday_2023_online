package student_viktor_kuzmin.homework_lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class Task_29 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter array length: ");
            int arLength = scanner.nextInt();

            int[] freeArray = new int[arLength];
            Random random = new Random();

            for (int i = 0; i < arLength; i++) {
                freeArray[i] = random.nextInt(100);
                System.out.println("Cell Nr" + i + ": " + freeArray[i]);
            }
            System.out.println("Even numbers in an array: ");
            for (int i = 0; i < arLength; i++) {
                if (freeArray[i] % 2 == 0) {
                    System.out.println("Nr" + i +  ": " + freeArray[i]);
                }
            }
    }
}
