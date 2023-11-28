package student_aleksandrs_jeleckis.lesson_1.Level_2;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        System.out.println("Please write down your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}