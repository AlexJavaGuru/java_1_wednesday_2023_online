package student_slava_subacius.lesson_5_2;

import java.util.Random;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(50);
        }
        System.out.println("Array: " + myArray[0] + ", " + myArray[1] + ", " + myArray[2]);
        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }
        double average = (double) sum / myArray.length;
        System.out.println("Average value: " + average);

    }
}
