package student_svetlana_daugele.lesson_2.level_3;

import java.util.Scanner;

public class ArithmeticMean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number = ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number = ");
        int number3 = scanner.nextInt();
        double midresult = number1 + number2 + number3;
        double result = midresult /3;
        System.out.println("Arithmetic mean of numbers " + number1 + " , " + number2 + "and  "
        +number3 + " is " + result);

    }
}
