package student_aleksandrs_jeleckis.lesson_5.level_2;

import java.util.Random;

class Task_13 {

    void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    int getSumm(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }


    public static void main(String[] args) {

        int[] numbers = new int[3];

        Task_13 random = new Task_13();
        random.fillArrayWithRandomNumbers(numbers);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("Summ");

        // System.out.println(numbers[0] + numbers[1] + numbers[2]);
        System.out.println(random.getSumm(numbers));

    }
}
