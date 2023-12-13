package student_dmitrijs_voronins.Task_4;

import java.util.Random;

public class Task_29 {
    public static void main(String[] args) {
        int[] myArray = new int[7];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(11);
            System.out.print(myArray[i] + " ");
        }
        int even = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.println();
                System.out.println(myArray[i] + ", " );
            }
        }
    }
}
