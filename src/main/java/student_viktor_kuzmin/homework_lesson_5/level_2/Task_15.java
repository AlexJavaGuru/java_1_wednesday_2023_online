package student_viktor_kuzmin.homework_lesson_5.level_2;

import java.util.Random;

class Task_15 {

    public static void main(String[] args) {

        int[] myArray = new int[3];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(300);
            System.out.println("Cell value" + i + ": " + myArray[i]);
        }
        System.out.println();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] + 2;
            System.out.println("Cell value" + i + ": " + myArray[i]);

        }

    }
}
