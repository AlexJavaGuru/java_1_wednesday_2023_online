package student_dmitrij_petrass.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / (double) secondNumber);

    }
}
