package student_artur_zaharov.lesson_5.level_2;

import java.util.Random;

class Task_15 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        int number3 = random.nextInt(100);

        numbers[0] = number1;
        numbers[1] = number2;
        numbers[2] = number3;

        System.out.println("Random number 1: " + numbers[0]);
        System.out.println("Random number 2: " + numbers[1]);
        System.out.println("Random number 3: " + numbers[2]);

        int sum1 = (number1 + 2);
        int sum2 = (number2 + 2);
        int sum3 = (number3 + 2);


        System.out.println("Sum +2 + number 1: " + sum1 );
        System.out.println("Sum +2 + number 2: " + sum2);
        System.out.println("Sum +2 + number 3: " + sum3);

    }
}

