package student_dmitrijs_voronins.Task_2;

import java.util.Random;

public class Task_12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[3];
        for (int i = 0; i<myArray.length; i++){
            myArray[i] = random.nextInt();
            System.out.println(myArray[i]);
        }
    }
}

//апишите программу, в которой:
//        - создайте массив целых чисел длиной 3,
//        - заполните каждую ячейку массива случайным числом,
//        - выведите значение каждой ячейки на консоль.




