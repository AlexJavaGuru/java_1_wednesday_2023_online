package student_svetlana_daugele.lesson_5.level_5_and_6;

import java.util.Random;
public class ArrayUtil {
    public int[] createArray(int arrayLength) {

        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random ();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
    public void printArrayToConsole(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}