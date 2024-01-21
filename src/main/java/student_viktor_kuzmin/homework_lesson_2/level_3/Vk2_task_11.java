package student_viktor_kuzmin.homework_lesson_2.level_3;

import java.util.Scanner;

public class Vk2_task_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Input number 2: ");
        int number2 = sc.nextInt();
        System.out.println("Input number 3: ");
        int number3 = sc.nextInt();


        double average = (double)(number1 + number2 + number3)/3;

        System.out.println("average = " + average);

    }
}
