package student_dmitrij_petrass.lesson_4.level_2;

import java.util.Scanner;

class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter two integers");

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        if (numberOne < numberTwo) {
            System.out.println("This number is smaller");
            System.out.println(numberOne);
        } else {
            System.out.println("This number is smaller");
            System.out.println(numberTwo);
        }
    }

}

