package student_svetlana_daugele.lesson_3.level_2;
import java.util.Scanner;
public class What_is_your_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        String greeting = "Hello, " + userName + "!";
        System.out.println(greeting);
    }
}