package student_aleksandrs_jeleckis.lesson_5.level_2;

import java.util.Random;

class Task_15 {

    void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    void incrArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 2;
        }
    }

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Task_15 random = new Task_15();

        random.fillArrayWithRandomNumbers(numbers);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("Increased numbers");
        random.incrArray(numbers);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

    }
}
