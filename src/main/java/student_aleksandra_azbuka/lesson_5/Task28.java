package student_aleksandra_azbuka.lesson_5;
import java.util.Random;
class Task28 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("Your array: ");

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        System.out.println("Min number in array = " + minNumber);
    }
}
