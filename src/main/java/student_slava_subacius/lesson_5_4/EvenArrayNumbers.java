package student_slava_subacius.lesson_5_4;


import java.lang.reflect.Array;
import java.util.Random;

public class EvenArrayNumbers {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30) ;
        }
            System.out.println("Array elements: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

            System.out.println();
            System.out.println("Even numbers: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    System.out.print(array[i] + " ");
                }
            }

    }

}