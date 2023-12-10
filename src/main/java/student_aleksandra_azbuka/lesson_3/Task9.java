package student_aleksandra_azbuka.lesson_3;
import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }
}
