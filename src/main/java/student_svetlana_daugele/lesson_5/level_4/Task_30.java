package student_svetlana_daugele.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

public class Task_30 {
    public static void main(String[] args) {


        int[] numbers = new int[6];
        int number;

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {

                System.out.println(numbers [i]);
            }
        }
    }
}
