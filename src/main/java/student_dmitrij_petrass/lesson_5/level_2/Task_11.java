package student_dmitrij_petrass.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number " + i + " : ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array cell values: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Cell " + i + " = " + numbers[i]);


        }
    }
}
