package student_aleksandra_azbuka.lesson_1;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number = ");
        Integer number = scanner.nextInt();

        System.out.println("Your number is " + number);
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
