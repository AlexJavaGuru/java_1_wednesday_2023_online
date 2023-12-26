package student_aleksandrs_jeleckis.lesson_4.level_2.Task_7;

import java.util.Scanner;

 class EqualNumber {
    void number() {

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
        } else if (valueNumberOne != valueNumberTwo) {
            System.out.println(" numbers are different");
        }
    }
}
