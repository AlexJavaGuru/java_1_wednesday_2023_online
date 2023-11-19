package student_svetlana_daugele.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = (double) firstNumber / secondNumber;

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The result of multiplication is: " + multiplication);
        System.out.println("The result of division is: " + division);
    }

}