package student_viktor_kuzmin.homework_lesson_2.level_3;

import java.util.Scanner;

public class Vk2_task_10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a radius: ");

        double radius = in.nextDouble();

        double area = Math.PI * (radius * radius);
        System.out.println("area of a circle = " + area);

        double circumference= Math.PI * 2*radius;
        System.out.println("circumference = " + circumference);

    }
}
