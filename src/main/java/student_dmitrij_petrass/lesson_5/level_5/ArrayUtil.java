package student_dmitrij_petrass.lesson_5.level_5;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        if (arrayLength <= 0) {
            return new int[0];
        }
        int[] newArray = new int[arrayLength];
        return newArray;
    }

    public void fillArrayWithRandomNumber(int[] array) {
        Random newArray = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = newArray.nextInt(50);
        }
    }
}
