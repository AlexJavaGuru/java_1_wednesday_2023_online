package student_svetlana_daugele.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_15 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]*= 2;

            System.out.println("[" + i + "] : " + numbers[i]);
        }
    }
}
