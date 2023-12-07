package student_slava_subacius.lesson_5_2;

import java.util.Arrays;
import java.util.Random;

public class SumOfArray {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(50) ;
        }

        System.out.println("Arrays: " + Arrays.toString(myArray));
        int sum = 0;
        for (int num : myArray) {
            sum += num;

        }
        System.out.println("Sum of elements: " + sum);

    }
}
