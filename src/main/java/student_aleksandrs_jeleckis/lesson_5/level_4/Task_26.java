package student_aleksandrs_jeleckis.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class Task_26 {
    public static void main(String[] args) {

        Task_26 chkVl = new Task_26();
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
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
