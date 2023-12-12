package student_dmitrij_petrass.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first integer");
        int numberOne = scanner.nextInt();

        System.out.println("Please, enter second integer");
        int numberTwo = scanner.nextInt();

        System.out.println("Please, enter third integer");
        int numberThree = scanner.nextInt();

        if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.println("All numbers are equals");
        } else if (numberOne != numberTwo && numberTwo != numberThree && numberOne != numberThree) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

}
