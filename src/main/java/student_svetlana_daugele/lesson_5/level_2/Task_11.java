package student_svetlana_daugele.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the integer number: ");
        numbers [0] = scanner.nextInt();

        System.out.print("Please enter the integer number: ");
        numbers [1] = scanner.nextInt();

        System.out.print("Please enter the integer number: ");
        numbers [2] = scanner.nextInt();

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(Arrays.toString(numbers)); // the other possibility for output to console

    }
}
