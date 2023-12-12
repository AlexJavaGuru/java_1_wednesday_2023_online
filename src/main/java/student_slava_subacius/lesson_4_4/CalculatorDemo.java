package student_slava_subacius.lesson_4_4;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       int result = calculator.sum(10,5);
        System.out.println("Sum: " + result);

        result = calculator.subtract(10, 5);
        System.out.println("Difference: " + result);

        result = calculator.multiply(10, 5);
        System.out.println("Product: " + result);

        result = calculator.division(10, 5);
        System.out.println("Quotient: " + result);
    }
}


