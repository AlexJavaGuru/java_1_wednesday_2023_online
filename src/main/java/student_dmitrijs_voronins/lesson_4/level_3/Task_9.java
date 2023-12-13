package student_dmitrijs_voronins.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your first number : ");

        int userInputOne = scanner.nextInt();

        System.out.println("Type yor second number : ");

        int userInputTwo = scanner.nextInt();

        System.out.println("Type your third number : ");

        int userInputThre = scanner.nextInt();


        if (userInputOne > userInputTwo && userInputTwo > userInputThre) {
            System.out.println("increasing");
        }else if(userInputOne < userInputTwo && userInputTwo < userInputThre) {
            System.out.println("decreasing");
        }else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
