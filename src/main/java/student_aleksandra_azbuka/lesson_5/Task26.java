package student_aleksandra_azbuka.lesson_5;
import java.util.Scanner;
import java.util.Random;
class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Array length = ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("Your array: ");

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        scanner.close();
    }
}
