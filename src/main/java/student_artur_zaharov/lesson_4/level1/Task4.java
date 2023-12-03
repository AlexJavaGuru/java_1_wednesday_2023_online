package student_artur_zaharov.lesson_4.level1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Please enter number");
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        System.out.println("typed number: " + userInput);

        if (userInput % 2 == 0) {
            System.out.println("chislo " + userInput + " chetnoje");
        }
        else {
            System.out.println("chislo " + userInput + " nechetnoje");
        }
    }
}