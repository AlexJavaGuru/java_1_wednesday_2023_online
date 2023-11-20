package student_sergejs_kibals.homework1;

import java.util.Scanner;

public class task11 {

    public static void main(String[] args) {

        System.out.println("Please, enter the first number:");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Please, enter the second number:");

        int number2 = scanner.nextInt();

        System.out.println("Please, enter the third number:");

        int number3 = scanner.nextInt();

        double result = ((double)number1+number2+number3) / 3;

        System.out.println("Three numbers average is: " + result);
    }
}
