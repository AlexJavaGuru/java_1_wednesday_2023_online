package student_viktor_kuzmin.homework_lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scanner.nextInt();

        int [] userArray = new int [length];

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            userArray[i] = random.nextInt(3000);
            System.out.println("Cell Nr" + i + ": " + userArray[i]);

        }
    }
}
