package teacher.lesson_6_arrays_while_loop.lessoncode.iterators;

import teacher.lesson_5_arrays_for_loop.lessoncode.ArrayUtil;

import java.util.Arrays;

public class DoWhileExample {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(myArray);

        System.out.println(Arrays.toString(myArray));
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] > max) {
//                max = myArray[i];
//            }
//        }
//        for (int number : myArray) {
//            if (number > max) {
//                max = number;
//            }
//        }
        int max = myArray[0];
        int i = 0;
        do {
            if (myArray[i] > max) {
                max = myArray[i];
            }
            i++;
        } while (i < myArray.length);


        System.out.println("Max = " + max);
    }
}
