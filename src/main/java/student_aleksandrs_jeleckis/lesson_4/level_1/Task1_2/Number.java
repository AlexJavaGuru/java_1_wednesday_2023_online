package student_aleksandrs_jeleckis.lesson_4.level_1.Task1_2;

import java.util.Scanner;

 class Number {

    int Number() {
        System.out.println("Please write number!");
        Scanner input = new Scanner(System.in);
        int value;
        value = input.nextInt();
        if (value == 0) {
            System.out.println("Number equal to zero!");
        } else if (value < 0) {
            System.out.println("Number is negative");
        } else if (value > 0) {
            System.out.println("Number is positive");
        }
        return value;
    }
}
