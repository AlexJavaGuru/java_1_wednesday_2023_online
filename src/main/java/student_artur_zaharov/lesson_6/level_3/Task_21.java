package student_artur_zaharov.lesson_6.level_3;

import java.util.Random;


public class Task_21 {

    public static void main(String[] args) {
        int[][] myArray = new int[2][2];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = random.nextInt(50);
            }
            System.out.println();

        }
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                sum+= myArray[i][j];
            }

        }
        System.out.println("Summa chisel: " + sum);
    }
}