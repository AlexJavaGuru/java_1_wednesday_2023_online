package student_dmitrijs_voronins.Task_2;

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[3];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt();
            System.out.println(myArray[i]);

        }
        int result = myArray[0] + myArray[1] + myArray[2];
        System.out.println(result);
    }
}
//Написашите программу, в которой:
// - создайте массив целых чисел длиной 3,
// - заполните каждую ячейку массива случайным числом,
// - посчитайте сумму всех ячеек и распечатайте ее на консоль.