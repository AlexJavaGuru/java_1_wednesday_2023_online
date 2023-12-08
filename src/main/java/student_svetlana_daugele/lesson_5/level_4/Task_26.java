package student_svetlana_daugele.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the array length: "); //запросите у пользователя с консоли длину массива
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];     //создайте массив указанной пользователем длины
        int number;

            Random random = new Random();       //заполните массив случайными числами
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
            }

            System.out.println(Arrays.toString(numbers)); //распечатайте на консоль все элементы массива.

}
}

