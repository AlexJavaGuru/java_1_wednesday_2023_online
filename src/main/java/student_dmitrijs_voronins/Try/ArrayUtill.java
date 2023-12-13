package student_dmitrijs_voronins.Try;

import java.util.Scanner;

public class ArrayUtill {
    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        return resultArray;
    }

    public void printArrayToConsole(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public int[] keepOnlyNumbers(int[] inputArray) {
        int resultArrayLength = countResultArrayLength(inputArray);
        ///int[] resultArray = copyOnlyNumber( );
        int[] resultArray = createArray(resultArrayLength);
        copyOnlyNumber(inputArray, resultArray);

        return resultArray;

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

    private void copyOnlyNumber(int[] source, int[] destination) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < source.length; i++) {
            if (max < source[i]) {
                max = source[i];
            } else {
                if (min > source[i]) {
                    min = source[i];
                    destination[max] = source[i];
                    max++;
                    destination[min] = source[i];
                    min++;
                }
            }
        }
    }
}






