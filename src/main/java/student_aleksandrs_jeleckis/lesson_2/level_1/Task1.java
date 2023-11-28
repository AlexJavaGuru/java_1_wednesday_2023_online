package student_aleksandrs_jeleckis.lesson_2.level_1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write down first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please write down second number");
        int secondNumber = scanner.nextInt();


        System.out.println("Results");
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber / secondNumber);
        System.out.println(firstNumber * secondNumber);
    }
}
