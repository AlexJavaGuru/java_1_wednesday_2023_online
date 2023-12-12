package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int[] myArray = new int[5];

        myArray[0] = 5;
        myArray[1] = 10;
        myArray[2] = 15;
        myArray[3] = 20;
        myArray[4] = 25;

        System.out.println(Arrays.toString(myArray));

        int result = myArray[0] + myArray[4];

        myArray[3] = 100;

        System.out.println(result);

        System.out.println(Arrays.toString(myArray));
    }

}
