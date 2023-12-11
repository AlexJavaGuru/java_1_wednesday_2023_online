package student_slava_subacius.lesson_5_4;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] myArray = new int[arrayLength];

        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(50);

            System.out.println("Array values:");
            for (int value : myArray) {
                System.out.print(value + " ");

            }
        }
    }
}