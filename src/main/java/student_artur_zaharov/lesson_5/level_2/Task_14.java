package student_artur_zaharov.lesson_5.level_2;

import java.util.Random;

class Task_14 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        int number3 = random.nextInt(100);

        numbers[0] = number1;
        numbers[1] = number2;
        numbers[2] = number3;

        int sum = (number1 + number2 + number3);
        double avg = (sum / 3);

        System.out.println("Random number 1: " + numbers[0]);
        System.out.println("Random number 2: " + numbers[1]);
        System.out.println("Random number 3: " + numbers[2]);
        System.out.println(sum);
        System.out.println(avg);
    }
}

