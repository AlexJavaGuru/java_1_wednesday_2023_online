package student_slava_subacius.lesson_5_2;

import java.util.Arrays;
import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] userArray = new int[3];
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Type your array size: " + i );
            int arrayLengthFromUser = scanner.nextInt();

            int[] Array = new int[arrayLengthFromUser];

            System.out.println(Arrays.toString(userArray));
        }

    }
}
