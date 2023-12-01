package student_sergejs_kibals.homework1;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {

        System.out.println("Please, input a number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result1 = number;
        int result2 = number * 2;
        int result3 = number * 3;
        int result4 = number * 4;
        int result5 = number * 5;
        int result6 = number * 6;
        int result7 = number * 7;
        int result8 = number * 8;
        int result9 = number * 9;
        int result10 = number * 10;

        System.out.println(number + " X 1 = " + result1);
        System.out.println(number + " X 2 = " + result2);
        System.out.println(number + " X 3 = " + result3);
        System.out.println(number + " X 4 = " + result4);
        System.out.println(number + " X 5 = " + result5);
        System.out.println(number + " X 6 = " + result6);
        System.out.println(number + " X 7 = " + result7);
        System.out.println(number + " X 8 = " + result8);
        System.out.println(number + " X 9 = " + result9);
        System.out.println(number + " X 10 = " + result10);
    }
}
