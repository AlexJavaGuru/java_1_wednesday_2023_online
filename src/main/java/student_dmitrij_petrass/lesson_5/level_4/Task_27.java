package student_dmitrij_petrass.lesson_5.level_4;

import java.util.Arrays;

class Task_27 {

    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25, 30};


        for (int i = 0; i < array.length; i++) {
            System.out.println("Array length " + "[" + i + "] : " + array[i]);
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("MAX number of array " + max);

    }
}