package student_aleksandra_azbuka.lesson_4;
import java.util.Scanner;
class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Entered number is positive.");
        } else if (number < 0) {
            System.out.println("entered number is negative.");
        }
        scanner.close();
    }
}
