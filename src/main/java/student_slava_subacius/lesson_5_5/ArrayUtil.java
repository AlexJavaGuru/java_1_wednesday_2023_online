package student_slava_subacius.lesson_5_5;


import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];

        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            resultArray[i] = random.nextInt(10);
        }
        return resultArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
        if (array == null) {
            System.out.println("Array is null");
            return;
        }

        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }

        }

        return maxNumber;
    }

    public void printArrayToConsole() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 7, 1, 9, 5};
        arrayUtil.printArrayToConsole(array);
    }

    public int findMinNumber(int[] array) {

        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];

            }
        }
        return minNumber;
    }
}