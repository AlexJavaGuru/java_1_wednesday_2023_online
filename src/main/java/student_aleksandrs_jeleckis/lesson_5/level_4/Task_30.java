package student_aleksandrs_jeleckis.lesson_5.level_4;

import java.util.Random;

class Task_30 {

    public static void main(String[] args) {

        Task_30 chkVl = new Task_30();

        int[] numbers = new int[20];
        chkVl.putValue(numbers);
        System.out.println("Array values:");
        chkVl.checkValue(numbers);
        System.out.println("Uneven values:");
        chkVl.unevenValue(numbers);
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

    void unevenValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }

}
