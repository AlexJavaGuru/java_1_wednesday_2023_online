package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Arrays;
import java.util.Random;

public class FilteringArrays {

    public static void main(String[] args) {
        int[] myArray = new int[100];

        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100) - 50;
        }

        System.out.println(Arrays.toString(myArray));

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] resultArray = arrayUtil.keepOnlyPositive(myArray);

//        int resultArrayLength = 0;
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] > 0) {
//                resultArrayLength++;
//            }
//        }
//
//        int[] resultArray = new int[resultArrayLength];
//        int j = 0;
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] > 0) {
//                resultArray[j] = myArray[i];
//                j++;
//            }
//        }

        System.out.println(Arrays.toString(resultArray));
    }
}
