package student_sergejs_kibals.homework3.level1;

import java.util.Scanner;

class Task3 {

    public static void main(String[] args) {

        System.out.println("Please, enter the number/ day of the week:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("It's Monday!");
        } else if (number == 2) {
            System.out.println("It's Tuesday!");
        } else if (number == 3) {
            System.out.println("It's Wednesday!");
        } else if (number == 4) {
            System.out.println("It's Thursday!");
        } else if (number == 5) {
            System.out.println("It's Friday!");
        } else if (number == 6) {
            System.out.println("It's Saturday!");
        } else if (number == 7) {
            System.out.println("It's Sunday!");
        } else {
            System.out.println("There are only seven days in a week!");
        }
    }
}