package student_artur_zaharov.lesson_4.level2;

import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {

        System.out.println("Please enter number two numbers");
        Scanner scanner = new Scanner(System.in);

        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();

        System.out.println("typed number pervoje: " + userInput1);
        System.out.println("typed number vtoroje: " + userInput2);

        if (userInput1 == userInput2) {
            System.out.println(userInput1 + "  i  " + userInput2 + "  ravni");
        }
        else {
            System.out.println(userInput1 + "  i   " + userInput2 + "  ne ravni");
        }
    }
}

