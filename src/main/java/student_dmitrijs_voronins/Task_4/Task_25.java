package student_dmitrijs_voronins.Task_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int myArray = 0;
        myArray = scanner.nextInt();
        int[] array = new int[myArray];


        for (int i = 0; i < myArray; i++) {
            System.out.println("Enter array element : ");
            System.out.println("Index: " + i);
            array[i] = scanner.nextInt();
            System.out.println();
        }
        System.out.println("Lenght of array: " + myArray);
        System.out.println("Array element : " + Arrays.toString(array));
    }
}
//Напишите программу, в которой:
//- запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив числами полученными от пользователя
//- распечатайте на консоль все элементы массива.