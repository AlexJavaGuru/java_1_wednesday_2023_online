package student_viktor_kuzmin.homework_lesson_5.level_5;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
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
        int maxNum = array[0];
        for (int value : array) {
            if (value > maxNum) {
                maxNum = value;
            }
        }
        return maxNum;
    }

    public int findMinNumber(int[] array) {
        int minNum = array[0];
        for (int value : array) {
            if (value < minNum) {
                minNum = value;
            }
        }
        return minNum;
    }
}



