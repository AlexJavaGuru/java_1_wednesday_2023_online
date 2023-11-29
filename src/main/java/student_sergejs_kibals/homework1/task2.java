package student_sergejs_kibals.homework1;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        double result1 = number1 + number2;
        double result2 = number1 - number2;
        double result3 = number1 * number2;
        double result4 = number1 / number2;

        System.out.println("addition = " + result1);
        System.out.println("subtraction = " + result2);
        System.out.println("multiplication = " + result3);
        System.out.println("division = " + result4);
    }
}
