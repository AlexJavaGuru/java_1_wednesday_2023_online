package student_slava_subacius.lesson_5_4;

import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] myArray = new int[arrayLength];


        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter a value " + i + ":");
            myArray[i] = scanner.nextInt();
        }
        System.out.println("Array values:");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
}
