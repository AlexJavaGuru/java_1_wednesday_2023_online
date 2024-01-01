package student_aleksandrs_jeleckis.lesson_2.level_3;

import java.util.Scanner;

 class Task10 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write down radius value");

        double radius = scanner.nextDouble();
        double perimeter = 2 * radius * Math.PI;
        double area = Math.PI * (radius * radius);

        System.out.println("Perimeter " + perimeter);
        System.out.println("Area " + area);

    }
}