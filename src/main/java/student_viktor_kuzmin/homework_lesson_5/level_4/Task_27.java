package student_viktor_kuzmin.homework_lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class Task_27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = scanner.nextInt();

        int[] freeArray = new int[arrayLength];

        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            freeArray[i] = random.nextInt(3000);
            System.out.println("Cell Nr" + i + ": " + freeArray[i]);
        }

        int maxNumber = freeArray[0];
        for (int i = 1; i < arrayLength; i++) {
            if (freeArray[i] > maxNumber) {
                maxNumber = freeArray[i];
            }
        }
        System.out.println("Max number is: " + maxNumber);
    }
}
