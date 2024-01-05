package student_aleksandrs_jeleckis.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_28 {
    public static void main(String[] args) {

        Task_28 chkVl = new Task_28();

        int[] numbers = new int[5];
        chkVl.putValue(numbers);
        System.out.println("Array values:");
        chkVl.checkValue(numbers);
        System.out.println("Lowest value:");
        chkVl.lowValue(numbers);
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

    void lowValue(int[] array) {
        Arrays.sort(array);
        System.out.println(array[0]);
    }
}
