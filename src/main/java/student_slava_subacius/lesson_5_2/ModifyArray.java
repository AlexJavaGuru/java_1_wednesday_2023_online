package student_slava_subacius.lesson_5_2;


import java.util.Random;

public class ModifyArray {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10);

            System.out.println("Source array: " + myArray[0] + ", " + myArray[1] + ", " + myArray[2]);
            for (int j = 0; i < myArray.length; i++) {
                myArray[i] += 2;
            }


            System.out.println("Modified array: " + myArray[0] + ", " + myArray[1] + ", " + myArray[2]);
        }
    }
}
