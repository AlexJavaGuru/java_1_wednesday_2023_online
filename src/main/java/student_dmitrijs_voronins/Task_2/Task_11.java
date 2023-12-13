package student_dmitrijs_voronins.Task_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArray = 3;
        int[] array = new int[myArray];
        for (int i = 0; i < myArray; i++) {
            System.out.println("Enter array element : ");
            System.out.println("Index: " + i);
            array[i] = scanner.nextInt();

        }
    }


}
//Напишите программу, в которой:
// - создайте массив целых чисел длиной 3,
// - заполните каждую ячейку массива числом, запрошенным у пользователя,
// - выведите значение каждой ячейки на консоль.
