package student_viktor_kuzmin.homework_lesson_2.level_3;


import java.util.Scanner;

public class Vk2_task_9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");

        int number = in.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(number + " * " + i + " = " + (number*i));
        }


    }
}
