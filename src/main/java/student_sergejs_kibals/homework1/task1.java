package student_sergejs_kibals.homework1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int result1 = number1 + number2;
        int result2 = number1 - number2;
        int result3 = number1 * number2;
        double result4 = (double) number1 / number2;

        System.out.println("addition = " + result1);
        System.out.println("subtraction = " + result2);
        System.out.println("multiplication = " + result3);
        System.out.println("division = " + result4);
    }
}
