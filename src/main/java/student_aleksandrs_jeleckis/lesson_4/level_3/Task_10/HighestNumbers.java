package student_aleksandrs_jeleckis.lesson_4.level_3.Task_10;

import java.util.Scanner;

public class HighestNumbers {
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

        if (valueNumberOne > valueNumberTwo && valueNumberOne > valueNumberThree) {
            System.out.println(valueNumberOne + " is the highest");
        } else if (valueNumberTwo > valueNumberOne && valueNumberTwo > valueNumberThree) {
            System.out.println(valueNumberTwo + " is the highest");
        } else if (valueNumberThree > valueNumberOne && valueNumberThree > valueNumberTwo) {
            System.out.println(valueNumberThree + " is the highest");
        } else {
            System.out.println("Different result");
        }
    }
}
