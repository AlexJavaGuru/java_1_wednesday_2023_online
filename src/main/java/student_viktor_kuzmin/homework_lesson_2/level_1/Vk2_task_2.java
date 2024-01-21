package student_viktor_kuzmin.homework_lesson_2.level_1;

import java.util.Scanner;

public class Vk2_task_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("first num: ");
        double firstDouNum = sc.nextDouble();
        System.out.print("second num: ");
        double secondDouNum = sc.nextDouble();

        double sum = firstDouNum + secondDouNum;
        double difference = firstDouNum - secondDouNum;
        double multiplication = firstDouNum * secondDouNum;
        double division = (double) firstDouNum / secondDouNum;

        System.out.println("sum: " + sum);
        System.out.println("difference: " + difference);
        System.out.println("multiplication: " + multiplication);
        System.out.println("division: " + division);

    }
}