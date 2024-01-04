package student_aleksandrs_jeleckis.lesson_5.level_5_6;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        return resultArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public int findMinNumber(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
