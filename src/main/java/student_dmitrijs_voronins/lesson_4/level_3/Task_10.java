package student_dmitrijs_voronins.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your first number : ");

        int userInputOne = scanner.nextInt();

        System.out.println("Type yor second number : ");

        int userInputTwo = scanner.nextInt();

        System.out.println("Type your third number : ");

        int userInputThre = scanner.nextInt();


        if (userInputOne >= userInputTwo && userInputOne >= userInputThre) {
            System.out.println("A");
        }else if(userInputTwo >= userInputOne && userInputTwo >= userInputThre) {
            System.out.println("B");
        }else if (userInputThre >= userInputTwo && userInputThre >= userInputOne){
            System.out.println("C");
        }



    }
}
