package student_aleksandra_azbuka.lesson_5;
import java.util.Random;

class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);

        System.out.println("numbers sum = " + (numbers[0] + numbers[1] + numbers[2]));
    }
}