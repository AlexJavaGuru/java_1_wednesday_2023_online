package student_svetlana_daugele.lesson_2.level_3;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius = ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}

