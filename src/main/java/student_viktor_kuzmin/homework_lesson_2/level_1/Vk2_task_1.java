package student_viktor_kuzmin.homework_lesson_2.level_1;

import java.util.Scanner;

public class Vk2_task_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("first num: ");
        int firstNum = sc.nextInt();
        System.out.print("second num: ");
        int secondNum = sc.nextInt();

        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int multiplication = firstNum * secondNum;
        double division = (double) firstNum / secondNum;

        System.out.println("sum: " + sum);
        System.out.println("difference: " + difference);
        System.out.println("multiplication: " + multiplication);
        System.out.println("division: " + division);

    }
}
