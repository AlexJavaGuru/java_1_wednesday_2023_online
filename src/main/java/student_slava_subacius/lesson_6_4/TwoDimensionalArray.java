package student_slava_subacius.lesson_6_4;


import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] myArray = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(myArray[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += myArray[i][j];
            }

        }
        System.out.println("Sum in two dimensional array: " + sum);
    }
}