package student_artur_zaharov.lesson_4.level1;

import java.util.Scanner;

public class Task_1_3_ZA {

    public static void main(String[] args) {

        System.out.println("Please enter number from 1 till 7");
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        System.out.println("typed number: " + userInput);

        switch (userInput) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;






        }


    }

}
