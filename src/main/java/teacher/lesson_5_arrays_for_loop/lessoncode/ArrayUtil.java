package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        return resultArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
    }

    public int[] keepOnlyPositive(int[] inputArray) {
        int resultArrayLength = countResultArrayLength(inputArray);
        int[] resultArray = createArray(resultArrayLength);
        copyOnlyPositive(inputArray, resultArray);
        return resultArray;
    }

    private void copyOnlyPositive(int[] source, int[] destination) {
        int j = 0;
        for (int i = 0; i < source.length; i++) {
            if (source[i] > 0) {
                destination[j] = source[i];
                j++;
            }
        }
    }

    private int countResultArrayLength(int[] inputArray) {
        int result = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > 0) {
                result++;
            }
        }
        return result;
    }
}
