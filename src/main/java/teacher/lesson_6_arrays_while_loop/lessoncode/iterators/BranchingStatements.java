package teacher.lesson_6_arrays_while_loop.lessoncode.iterators;

import teacher.lesson_5_arrays_for_loop.lessoncode.ArrayUtil;

import java.util.Arrays;

public class BranchingStatements {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(myArray);

        System.out.println(Arrays.toString(myArray));

        for (int number : myArray) {
            if (number < 0) {
                continue;
            }
            System.out.println(number);
            break;
        }
    }
}
