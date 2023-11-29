package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArray = arrayUtil.createArray(50);
        arrayUtil.fillArrayWithRandomNumbers(myArray);

        System.out.println(Arrays.toString(myArray));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your array size");
        int arrayLengthFromUser = scanner.nextInt();

        int[] array = new int[arrayLengthFromUser];

        System.out.println(Arrays.toString(array));
    }
}
