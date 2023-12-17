package student_slava_subacius.lesson_5_5;


import java.util.Arrays;
import java.util.Random;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.fillArrayWithRandomNumbers();
        test.printArrayToConsole();
        test.findMaxNumber();
        test.shouldFindMaxNumber();
        test.findMinNumber();
        test.shouldFindMinNumber();
    }

    public void fillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 10;
        int[] resultArray = arrayUtil.createArray(arrayLength);

        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            resultArray[i] = random.nextInt(100);
        }

        System.out.println("Array filled with random numbers: " + Arrays.toString(resultArray));
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 10;
        int[] resultArray = arrayUtil.createArray(arrayLength);

        if (resultArray.length == arrayLength) {
            System.out.println("The length of the array is: " + resultArray.length);
        } else {
            System.out.println("Error! Array length is not equal: " + arrayLength);
        }
    }

    public void printArrayToConsole() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] exampleArray = {1, 2, 3, 4, 5};
        arrayUtil.printArrayToConsole(exampleArray);
    }

    public void findMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] exampleArray = {1, 10, 3, 7, 5};
        int maxNumber = arrayUtil.findMaxNumber(exampleArray);
        System.out.println("The max number array is: " + maxNumber);

    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 10;
        int[] array = arrayUtil.createArray(arrayLength);
        int expectedMaxNumber = 30;
        array[arrayLength - 1] = expectedMaxNumber;

        int maxNumber = arrayUtil.findMaxNumber(array);
        if (maxNumber == expectedMaxNumber) {
            System.out.println("Test passed: Max Number is " + expectedMaxNumber);
        } else {
            System.out.println("Test failed: Expected Max Number is " + expectedMaxNumber +
                    ", but actual Max Number is " + maxNumber);

        }
    }

    public void findMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {5, 3, 9, 10, 8};
        int minNumber = arrayUtil.findMinNumber(myArray);

        System.out.println("Min Number array is: " + minNumber);

    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {5, 3, 9, 10, 8};
        int expectedMinNumber = 3;


        int actualMinNumber = arrayUtil.findMinNumber(testArray);
        if (actualMinNumber == expectedMinNumber) {
            System.out.println("Test passed: Min Number is " + expectedMinNumber);
        } else {
            System.out.println("Test failed: Expected Min Number is " + expectedMinNumber +
                    ", but actual Min Number is " + actualMinNumber);
        }
    }

}








