package student_aleksandrs_jeleckis.lesson_4.level_3.Task_9;

import java.util.Scanner;

 class NumberOrder {
    void number() {

        int valueNumberOne;
        int valueNumberTwo;
        int valueNumberThree;

        System.out.println("Please write First number!");
        Scanner inputNumberOne = new Scanner(System.in);
        valueNumberOne = inputNumberOne.nextInt();

        System.out.println("Please write Second number!");
        Scanner inputNumberTwo = new Scanner(System.in);
        valueNumberTwo = inputNumberTwo.nextInt();

        System.out.println("Please write Third number!");
        Scanner inputNumberThree = new Scanner(System.in);
        valueNumberThree = inputNumberThree.nextInt();

        if (valueNumberOne < valueNumberTwo && valueNumberTwo < valueNumberThree) {
            System.out.println("increasing");
        } else if (valueNumberOne > valueNumberTwo && valueNumberTwo > valueNumberThree) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
