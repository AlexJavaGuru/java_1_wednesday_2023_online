package student_dmitrij_petrass.lesson_5.level_4;

import java.util.Arrays;

class Task_30 {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 13;
        numbers[2] = 15;
        numbers[3] = 19;
        numbers[4] = 20;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array length = " + numbers[i]);
        }

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println("Array not even numbers is " + number);

            }


        }
    }
}

