package student_aleksandrs_jeleckis.lesson_5.level_2;

import java.util.Random;

class Task_12 {
    void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Task_12 random = new Task_12();
        random.fillArrayWithRandomNumbers(numbers);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

    }

}
