package student_artur_zaharov.lesson_5.level_4;

import java.util.Random;
import java.util.Arrays;

class Task_28 {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Please enter length of massive");


        int[] array = new int[10];


        System.out.println("Please enter that amount of numbers to fill massive");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        {
            int minNumber = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < minNumber) {
                    minNumber = array[i];

                }

            }
            System.out.println("Min number = " + minNumber);
        }
    }
}