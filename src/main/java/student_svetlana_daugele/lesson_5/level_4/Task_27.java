package student_svetlana_daugele.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_27 {

    public static void main(String[] args) {


        int[] numbers = new int[5];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));

        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] > maxNumber){
                maxNumber = numbers [i];
            }
        }
        System.out.println (maxNumber);
    }
}


