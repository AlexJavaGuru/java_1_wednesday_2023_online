package student_dmitrij_petrass.lesson_5.level_4;

import java.util.Arrays;

class Task_29 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = -10;
        numbers[2] = 15;
        numbers[3] = -15;
        numbers[4] = 20;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array length = " + numbers[i]);
        }

        int resultArrayPostive = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                resultArrayPostive++;
            }
        }
        int[] resultArray = new int[resultArrayPostive];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                resultArray[j] = numbers[i];
                j++;
            }
        }
        System.out.println("Positive array numbers = " + Arrays.toString(resultArray));

    }


}
