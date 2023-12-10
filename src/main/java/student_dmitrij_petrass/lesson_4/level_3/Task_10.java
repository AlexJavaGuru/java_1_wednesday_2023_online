package student_dmitrij_petrass.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first integer");
        int numberOne = scanner.nextInt();

        System.out.println("Please, enter second integer");
        int numberTwo = scanner.nextInt();

        System.out.println("Please, enter third integer");
        int numberThree = scanner.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("This number is bigger");
            System.out.println(numberOne);

        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("This number is bigger");
            System.out.println(numberTwo);

        } else if (numberThree > numberOne && numberThree > numberTwo) {
            System.out.println("This number is bigger");
            System.out.println(numberThree);

        } else {
            System.out.println("ERROR");
        }
    }
}

