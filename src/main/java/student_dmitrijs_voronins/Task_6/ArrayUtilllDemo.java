package student_dmitrijs_voronins.Task_6;

import student_dmitrijs_voronins.Task_6.ArrayUtilll;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtilllDemo {
    public static void main(String[] args) {
        ArrayUtilll arrayUtilll = new ArrayUtilll();
        Scanner scanner = new Scanner(System.in);
        int [] myArray = new int[10];
        arrayUtilll.printArrayToConsole(myArray);
        scanner.nextInt();
        System.out.println(Arrays.toString(myArray));

    }

}
