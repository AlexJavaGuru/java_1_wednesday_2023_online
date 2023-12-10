package student_slava_subacius;

import java.util.Scanner;

public class Hi_YourName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi YourName");

        String userName = scanner.nextLine();
         String myName = "Slava";

        String greeting = "Hi " + userName + "!";
        System.out.println(greeting);
    }
}
