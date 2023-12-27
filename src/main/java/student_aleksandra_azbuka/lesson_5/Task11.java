package student_aleksandra_azbuka.lesson_5;
import java.util.Scanner;
class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter your number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);

        scanner.close();
    }
}
