package student_slava_subacius.lesson_5_4;

import java.util.Arrays;
import java.util.Random;

public class MinNumberInArray {
    public static void main(String[] args) {
        Random random = new Random();
        int length = random.nextInt(10);
        int[] array = new int [length];

        for(int i = 0; i < length; i ++) {
            array[i] = random.nextInt(50);
        }
            System.out.println("Array elements: ");
            System.out.println(Arrays.toString(array));

        int minNumber = array[1];
        for (int i = 0; i < length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];

            }
        }
        System.out.println("Smaller array number: " + minNumber);
    }
}
