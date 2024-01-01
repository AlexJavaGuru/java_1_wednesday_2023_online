package student_aleksandra_azbuka.lesson_5;
import java.util.Scanner;
class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length = ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("numbers[" + i + "] =  ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Your araay: ");

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        scanner.close();
    }
}
