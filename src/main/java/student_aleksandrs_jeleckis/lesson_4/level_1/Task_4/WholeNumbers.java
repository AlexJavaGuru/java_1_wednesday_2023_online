package student_aleksandrs_jeleckis.lesson_4.level_1.Task_4;

import java.util.Scanner;

 class WholeNumbers {

    double Number() {
        System.out.println("Please write number!");
        Scanner input = new Scanner(System.in);
        double value;
        value = input.nextDouble();
        if (value % 1 == 0) {
            System.out.println("Whole number!");
        } else if (value % 1 != 0) {
            System.out.println("Different number");
        }
        return  value;
    }
}
