package student_dmitrijs_voronins.Task_2;

import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {
        Random random = new Random();
    int [] myArray= new int[3];
    for (int i = 0 ; i <myArray.length; i++){
        myArray[i] = random.nextInt();
        System.out.println(myArray[i]);
    }
    int result1 = myArray[0]+2;
    int result2 = myArray[1]+2;
    int result3 = myArray[2]+2;
        System.out.println(result1 + "  " + result2 + "  " + result3);

    }


}
//Напишите программу, в которой:
// - создайте массив целых чисел длиной 3,
// - заполните каждую ячейку массива случайным числом,
// - выведите значение каждой ячейки на консоль,
// - увеличьте значение каждой ячейки на 2,
// - выведите значение каждой ячейки на консоль.