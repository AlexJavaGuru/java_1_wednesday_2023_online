package student_dmitrijs_voronins.lesson_4.level_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your first number : ");

        int userInputOne = scanner.nextInt();

        System.out.println("Type yor second number : ");

        int userInputTwo = scanner.nextInt();


        if (userInputOne >= userInputTwo){
            System.out.println("First number is bigger");
        }else{
            System.out.println("Second number is bigger");

        }

    }
}

