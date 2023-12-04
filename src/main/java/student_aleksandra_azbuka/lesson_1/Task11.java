package student_aleksandra_azbuka.lesson_1;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number = ");
        Integer first = scanner.nextInt();
        System.out.println("Enter second number = ");
        Integer second = scanner.nextInt();
        System.out.println("Enter third number = ");
        Integer third = scanner.nextInt();
        System.out.println("Your numbers are = " + first + ", " + second + ", " + third);
        double result = (first + second + third)/3.0;
        System.out.println("Average = " + result);

    }
}
