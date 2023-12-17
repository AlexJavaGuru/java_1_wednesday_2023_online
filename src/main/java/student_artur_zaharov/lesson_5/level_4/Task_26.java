package student_artur_zaharov.lesson_5.level_4;

import java.util.Scanner;
import java.util.Random;

class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter length of massive");

        int mlength = scanner.nextInt();
        int[] array = new int[mlength];


        System.out.println("Please enter that amount of numbers to fill massive");
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Massiv No " + (i+1) + " = " + array[i]);


        }
    }
}