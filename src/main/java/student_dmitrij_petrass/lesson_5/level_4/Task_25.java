package student_dmitrij_petrass.lesson_5.level_4;

import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length");

        int lenght = scanner.nextInt();

        int[] numbers = new int[lenght];

        System.out.println("Enter array elements ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array length elements " + i + ":");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array elements ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
