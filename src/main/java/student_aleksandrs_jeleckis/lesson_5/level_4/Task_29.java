package student_aleksandrs_jeleckis.lesson_5.level_4;

import java.util.Random;

class Task_29 {
    public static void main(String[] args) {

        Task_29 chkVl = new Task_29();

        int[] numbers = new int[20];
        chkVl.putValue(numbers);
        System.out.println("Array values:");
        chkVl.checkValue(numbers);
        System.out.println("Even values:");
        chkVl.evenValue(numbers);
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

    void evenValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
