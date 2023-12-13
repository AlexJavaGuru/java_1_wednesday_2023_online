package student_dmitrijs_voronins.Task_5;

import java.util.Random;

class ArrayUtil {
    int[] createArray(int arrayLenght) {
        int[] resultArray = new int[arrayLenght];
        return resultArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}

//Напишите в этом классе метод для создания
//массива целых чисел указанной длины.
//
//class ArrayUtil {
//
//    public int[] createArray(int arrayLength) {
//        // Напишите реализацию !!!
//    }
//
//}