package student_aleksandrs_jeleckis.lesson_4.level_1.Task_3;

import java.util.Scanner;

class Week {
    int Week() {

        System.out.println("Please write number from 1-7");

        Scanner input = new Scanner(System.in);

        int userInput = input.nextInt();

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
            default:
                System.out.println("Number exceeding stated values");
        }
        return userInput;
    }
}
