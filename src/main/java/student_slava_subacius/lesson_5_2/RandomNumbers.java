package student_slava_subacius.lesson_5_2;

import teacher.lesson_5_arrays_for_loop.lessoncode.ArrayUtil;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] randomNumbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(40) ;
        }

        System.out.println(Arrays.toString(randomNumbers));

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] resultArray = arrayUtil.keepOnlyPositive(randomNumbers);


    }
}

