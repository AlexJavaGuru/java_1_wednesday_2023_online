package student_svetlana_daugele.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the array length: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];
        int number;
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter the number for cell " + (i + 1) + ": ");
            number = scanner.nextInt();
            numbers[i] = number;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
