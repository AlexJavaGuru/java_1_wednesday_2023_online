package student_aleksandrs_jeleckis.lesson_4.level_2.Task_5;

import java.util.Scanner;

 class HighestNumber {
    void Number() {

        int valueNumberOne;
        int valueNumberTwo;

        System.out.println("Please write First number!");
        Scanner inputNumberOne = new Scanner(System.in);
        valueNumberOne = inputNumberOne.nextInt();

        System.out.println("Please write Second number!");
        Scanner inputNumberTwo = new Scanner(System.in);
        valueNumberTwo = inputNumberTwo.nextInt();

        if (valueNumberOne == valueNumberTwo) {
            System.out.println("Numbers are equal !");
        } else if (valueNumberOne > valueNumberTwo) {
            System.out.println(valueNumberOne + " is higher");
        } else if (valueNumberTwo > valueNumberOne) {
            System.out.println(valueNumberTwo + " is higher");
        }
    }
}
