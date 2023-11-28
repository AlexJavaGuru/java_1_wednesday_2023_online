package student_aleksandrs_jeleckis.lesson_1.Level_3;

import java.util.Scanner;

public class Task11 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write down first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Please write down second number");
        double secondNumber = scanner.nextDouble();
        System.out.println("Please write down third number");
        double thirdNumber = scanner.nextDouble();

        double results = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Results");
        System.out.println(results);

    }
}