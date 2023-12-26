package student_aleksandrs_jeleckis.lesson_1.Level_1;
import java.util.Scanner;
 class Task1 {
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
