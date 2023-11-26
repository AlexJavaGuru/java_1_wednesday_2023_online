package student_sergejs_kibals.homework1;

import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {

        System.out.println("Please, enter the radius of a circle:");

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double perimeter = 2 * radius * 3.14;
        double area = radius * radius * 3.14;


        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = "+ area);

    }
}

