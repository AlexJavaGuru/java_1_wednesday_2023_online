package student_dmitrij_petrass.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("Perimeter = " + 2 * Math.PI * radius);
        System.out.println("Area = " + Math.PI * (radius * radius));
    }
}
