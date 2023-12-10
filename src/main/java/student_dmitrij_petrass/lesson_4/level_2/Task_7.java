package student_dmitrij_petrass.lesson_4.level_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first integer");
        int numberOne = scanner.nextInt();

        System.out.println("Please, enter second integer");
        int numberTwo = scanner.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("Numbers are equals");
        }else {
            System.out.println("Numbers are different");
        }
    }
}
