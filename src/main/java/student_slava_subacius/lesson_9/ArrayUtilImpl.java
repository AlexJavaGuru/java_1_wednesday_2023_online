package student_slava_subacius.lesson_9;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class ArrayUtilImpl implements ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int maxValue = -1;
        OptionalInt max = Arrays.stream(array).max();
        if(max.isPresent()) {
            maxValue = max.getAsInt();
        }
        return maxValue;
    }

    public int findMinNumber(int[] array) {
        int minValue = -1;
        OptionalInt min = Arrays.stream(array).min();
        if(min.isPresent()) {
            minValue = min.getAsInt();
        }
        return minValue;
    }


}
