package student_svetlana_daugele.lesson_4.level_1_intern;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the integer number between 1 and 7: ");
        int integerNumber = scanner.nextInt();


        if (integerNumber == 1) {
            System.out.print("Monday");
        }

        else if (integerNumber == 2) {
            System.out.print("Tuesday");
        }

        else if (integerNumber == 3) {
            System.out.print("Wednesday");
        }

        else if (integerNumber == 4) {
            System.out.print("Thursday");
        }
        else if (integerNumber == 5) {
            System.out.print("Friday");
        }
        else if (integerNumber == 6) {
            System.out.print("Saturday");
        }
        else if (integerNumber == 7) {
            System.out.print("Sunday");
        }
        else {
            System.out.print("The number your intered is < 1 or > 7.");
        }

    }

}
