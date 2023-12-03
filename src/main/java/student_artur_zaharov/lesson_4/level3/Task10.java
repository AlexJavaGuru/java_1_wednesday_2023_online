package student_artur_zaharov.lesson_4.level3;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {

        System.out.println("Please enter number three numbers");
        Scanner scanner = new Scanner(System.in);

        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int userInput3 = scanner.nextInt();

        System.out.println("typed number pervoje: " + userInput1);
        System.out.println("typed number vtoroje: " + userInput2);
        System.out.println("typed number tretje: " + userInput3);

        if ((userInput1 >= userInput2) && (userInput1 >= userInput3)) {
            System.out.println(userInput1);
        } else if ((userInput2 >= userInput1) && (userInput2 >= userInput3)) {
            System.out.println(userInput2);
        } else if ((userInput3 >= userInput1) && (userInput3 >= userInput2)) {
            System.out.println(userInput3);
        } else {
            System.out.println("error");
        }
    }
}
