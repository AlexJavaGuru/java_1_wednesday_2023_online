package student_sergejs_kibals.homework2;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {

        System.out.println("What is Your username?");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}
