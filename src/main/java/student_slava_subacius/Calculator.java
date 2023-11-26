package student_slava_subacius;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("enter radius : ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        scanner.close();

        if (radius >= 7.5) {

            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * Math.pow(radius, 2);


            System.out.println("radius : + perimeter");
            System.out.println("radius : + area");
        } else {
            System.out.println("radius <= 7.5. result = true.");
        }
    }
}
