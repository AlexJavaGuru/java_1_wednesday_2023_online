package student_artur_zaharov.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_29 {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Please enter length of massive");


        int[] array = new int[10];


        System.out.println("Please enter that amount of numbers to fill massive");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));


        int oddNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                oddNumber++;
            }

        }
        int[] resultOddNumber = new int[oddNumber];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                resultOddNumber[j] = array[i];
                j++;

            }
        }
        System.out.println(Arrays.toString(resultOddNumber));
    }
}
