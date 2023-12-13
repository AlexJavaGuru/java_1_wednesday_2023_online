package student_dmitrijs_voronins.Task_2;

import java.util.Arrays;

class Task_10 {
    public static void main(String[] args) {
        int [] myArray = new int[3];

        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;

        for (int i = 0; i <myArray.length; i++){
            System.out.println(myArray[i]);
        }
        System.out.println(Arrays.toString(myArray));

    }
}
///Напишите программу, в которой:
// - создайте массив целых чисел длиной 3,
// - заполните каждую ячейку массива любым целым числом,
// - выведите значение каждой ячейки на консоль.