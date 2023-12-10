package student_artur_zaharov.lesson_5.level_2;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

            int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number");
        int number1 = scanner.nextInt();
        System.out.println("Type second number");
        int number2 = scanner.nextInt();
        System.out.println("Type third number");
        int number3 = scanner.nextInt();


            numbers[0] = number1;
            numbers[1] = number2;
            numbers[2] = number3;


            System.out.println("Typed number 1: " + numbers[0]);
            System.out.println("Typed number 2: " + numbers[1]);
            System.out.println("Typed number 3: " + numbers[2]);
        }
}


