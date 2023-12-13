package student_dmitrijs_voronins.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your first number : ");

        int userInputOne = scanner.nextInt();

        System.out.println("Type yor second number : ");

        int userInputTwo = scanner.nextInt();

        System.out.println("Type your third number : ");

        int userInputThre = scanner.nextInt();


        if (userInputOne == userInputTwo && userInputOne == userInputThre) {
            System.out.println("All numbers are equal");
        }else if(userInputOne != userInputTwo && userInputOne != userInputThre) {
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }
    }

//Write a Java program that accepts three numbers and prints:
// -"All numbers are equal" if all three numbers are equal,
// - "All numbers are different" if all three numbers are different
// - "Neither all are equal or different" otherwise.