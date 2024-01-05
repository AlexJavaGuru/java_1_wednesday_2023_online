package student_aleksandrs_jeleckis.lesson_5.level_4;

import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {

        Task_25 chkVl = new Task_25();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write down array length");
        int userInput = scanner.nextInt();

        int[] numbers = new int[userInput];
        chkVl.putValue(numbers);
        System.out.println("Array values:");
        chkVl.checkValue(numbers);
    }

    void checkValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    void putValue(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input arrays value");
            array[i] = scanner.nextInt();
        }
    }
}
