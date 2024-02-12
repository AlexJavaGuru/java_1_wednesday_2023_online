package student_viktor_kuzmin.homework_lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {

    public static void main(String[] args) {
        ArrayCopy arrayCopy = new ArrayCopy();

        int[] inputArray1 = {1, 2, 3, 4, 5};
        int numberFrom1 = 1;
        int numberTo1 = 5;
        int[] expectedArray1 = {1, 2, 3, 4, 5};
        testScenario(arrayCopy, inputArray1, numberFrom1, numberTo1, expectedArray1);

        int[] inputArray2 = {1, 2, 3, 4, 5};
        int numberFrom2 = 2;
        int numberTo2 = 4;
        int[] expectedArray2 = {2, 3, 4};
        testScenario(arrayCopy, inputArray2, numberFrom2, numberTo2, expectedArray2);

    }

    private static void testScenario(ArrayCopy arrayCopy, int[] inputArray, int numberFrom, int numberTo, int[] expectedArray) {
        int[] result = arrayCopy.copyInRange(inputArray, numberFrom, numberTo);
        if (arraysEqual(result, expectedArray)) {
            System.out.println("Test passed for input array: " + Arrays.toString(inputArray));
        } else {
            System.out.println("Test failed for input array: " + Arrays.toString(inputArray));
        }
    }

    private static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
