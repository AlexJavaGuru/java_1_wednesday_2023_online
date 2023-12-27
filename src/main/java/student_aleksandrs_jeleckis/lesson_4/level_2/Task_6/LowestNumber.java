package student_aleksandrs_jeleckis.lesson_4.level_2.Task_6;

import java.util.Scanner;

 class LowestNumber {
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
        } else if (valueNumberOne > valueNumberTwo) {
            System.out.println(valueNumberTwo + " is lowest");
        } else if (valueNumberTwo > valueNumberOne) {
            System.out.println(valueNumberOne + " is lowest");
        }
    }
}
