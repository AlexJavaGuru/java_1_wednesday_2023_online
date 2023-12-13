package student_dmitrijs_voronins.Task_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int myArray = 0;
        myArray = scanner.nextInt();
        int[] array = new int[myArray];
        Random random = new Random();

        for (int i = 0; i < myArray; i++) {
            array[i] = random.nextInt(100);
            System.out.println();
        }
        System.out.println("Lenght of array: " + myArray);
        System.out.println("Array element : " + Arrays.toString(array));

    }

}
//Напишите программу, в которой:
//- запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива.