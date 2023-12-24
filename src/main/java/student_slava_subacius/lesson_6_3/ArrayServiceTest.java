package student_slava_subacius.lesson_6_3;

import java.util.Arrays;

public class ArrayServiceTest {


    public static void main(String[] args) {

        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        int numberToSearch = 3;
        boolean result = arrayService.contains(arr, numberToSearch);
        if (result) {
            System.out.println("The array contains a number: " + numberToSearch);
        } else {
            System.out.println("The array does not contain a number: " + numberToSearch);
        }

        int[] arr1 = {1, 2, 3, 4, 5};
        int numberToSearch1 = 6;
        boolean result1 = arrayService.contains(arr1, numberToSearch1);
        if (result1) {
            System.out.println("The array contains a number: " + numberToSearch1);
        } else {
            System.out.println("The array does not contain a number: " + numberToSearch1);
        }

        int[] arr2 = {1, 2, 3, 3};
        int numberToSearch2 = 3;

        int occurrences = arrayService.countOccurrences(arr2, numberToSearch2);
        System.out.println("Number" + numberToSearch2 + " occurs in the array "
                + occurrences + " times.");


        int[] arr3 = {1, 2, 3, 4};
        int numberToSearch3 = 4;
        boolean result3 = arrayService.contains(arr3, numberToSearch3);
        if (result3) {

            System.out.println("The array contains a number: " + numberToSearch3);
        } else {
            System.out.println("The array does not contain a number: " + numberToSearch3);
            System.out.println("Answer: 0 - number " + numberToSearch3 + " not contained in array.");
        }


        int[] arr4 = {1, 2, 3, 4, 5};
        int numberToReplace4 = 3;
        int newNumber4 = 6;

        boolean result4 = arrayService.replaceFirst(arr4, numberToReplace4, newNumber4);
        System.out.println("Result 1: " + result4);
        System.out.println("Modified array 1: " + Arrays.toString(arr4));

        int[] arr5 = {1, 2, 3, 4};
        int numberToReplace5 = 5;
        int newNumber5 = 6;
        boolean result5 = arrayService.replaceFirst(arr5, numberToReplace5, newNumber5);
        System.out.println("Result 2: " + result5);
        System.out.println("Modified array 2: " + Arrays.toString(arr5));


        int[] arr6 = {1, 2, 3, 3, 4, 5};
        int numberToReplace6 = 3;
        int newNumber6 = 0;
        boolean result6 = arrayService.replaceAll(arr6, numberToReplace6, newNumber6);
        result6 = arrayService.replaceFirst(arr6, numberToReplace6, newNumber6);
        System.out.println("Result 3: " + result6);
        System.out.println("Modified array 3: " + Arrays.toString(arr6));

        int[] arr7 = {1, 2, 3, 4, 5};
        int[] reverse = arrayService.reverse(arr7);
        System.out.println("Reverse array: " + Arrays.toString(reverse));


        int[] arr8 = {3, 2, 1, 4, 5};
        boolean isSort = arrayService.sort(arr8);
        if (isSort) {
            System.out.println("The array was sorted successfully: " + Arrays.toString(arr8));
        } else {
            System.out.println("Error! The array is not sorted: " + Arrays.toString(arr8));


            int[] arr9 = {1, 2, 3, 4, 5};
            isSort = arrayService.sort(arr9);
            if (isSort) {
                System.out.println("The array was sorted successfully: " + Arrays.toString(arr9));
            } else {
                System.out.println("Error! The array is not sorted: " + Arrays.toString(arr9));
            }
        }
    }
}











