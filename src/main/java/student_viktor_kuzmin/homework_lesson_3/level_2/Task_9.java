package student_viktor_kuzmin.homework_lesson_3.level_2;

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
