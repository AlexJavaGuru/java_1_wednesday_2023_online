package student_dmitrijs_voronins.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your number : ");

        int userInput = scanner.nextInt();

        if (userInput % 2== 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");

        }

    }
}

