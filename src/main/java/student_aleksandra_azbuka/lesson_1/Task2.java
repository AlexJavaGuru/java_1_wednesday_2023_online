package student_aleksandra_azbuka.lesson_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("X = ");
        Double firstNumber = scanner.nextDouble();

        System.out.println("Y = ");
        Double secondNumber = scanner.nextDouble();
        System.out.println("X + Y = " + (firstNumber + secondNumber));
        System.out.println("X - Y = " + (firstNumber - secondNumber));
        System.out.println("X * Y = " + (firstNumber * secondNumber));
        System.out.println("X / Y = " + (firstNumber / secondNumber));
    }
}
