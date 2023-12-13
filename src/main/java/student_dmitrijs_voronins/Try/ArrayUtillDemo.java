package student_dmitrijs_voronins.Try;


import student_dmitrijs_voronins.Try.ArrayUtill;

import java.util.Arrays;


public class ArrayUtillDemo {


    public static void main(String[] args) {


        ArrayUtill arrayUtil = new ArrayUtill();

        int[] myArray = arrayUtil.createArray(10);
        arrayUtil.printArrayToConsole(myArray);


        System.out.println(Arrays.toString(myArray));


    }
}

