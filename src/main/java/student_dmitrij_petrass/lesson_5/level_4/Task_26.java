package student_dmitrij_petrass.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length ");

        int lenght = scanner.nextInt();

        int[] numbers = new int [lenght];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Array random elements");
        for (int number : numbers) {
            System.out.println("Array = " + number);
        }

    }
}
