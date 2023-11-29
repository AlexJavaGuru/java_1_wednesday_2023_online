package student_aleksandra_azbuka.lesson_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("X = ");
        Integer firstNumber = scanner.nextInt();

        System.out.println("Y = ");
        Integer secondNumber = scanner.nextInt();
        System.out.println("X + Y = " + (firstNumber + secondNumber));
        System.out.println("X - Y = " + (firstNumber - secondNumber));
        System.out.println("X * Y = " + (firstNumber * secondNumber));
        System.out.println("X / Y = " + (firstNumber / secondNumber));
    }
}
