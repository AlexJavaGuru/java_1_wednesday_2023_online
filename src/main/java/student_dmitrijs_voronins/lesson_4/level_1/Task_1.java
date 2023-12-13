package student_dmitrijs_voronins.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your number : ");

        int userInput = scanner.nextInt();

        if (userInput >= 1){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");

        }

    }
}




// Написать программу, которая запрашивает у
//пользователя
//целое число и выводит на консоль
//положительное оно или отрицательное.