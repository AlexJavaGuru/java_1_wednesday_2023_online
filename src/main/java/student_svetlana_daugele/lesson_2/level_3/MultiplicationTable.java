package student_svetlana_daugele.lesson_2.level_3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        int multiplication1 = number;
        int multiplication2 = number * 2;
        int multiplication3 = number * 3;
        int multiplication4 = number * 4;
        int multiplication5 = number * 5;
        int multiplication6 = number * 6;
        int multiplication7 = number * 7;
        int multiplication8 = number * 8;
        int multiplication9 = number * 9;
        int multiplication10 = number * 10;
        System.out.println(number + " * " + "1" + " = " + multiplication1);
        System.out.println(number + " * " + "2" + " = " + multiplication2);
        System.out.println(number + " * " + "3" + " = " + multiplication3);
        System.out.println(number + " * " + "4" + " = " + multiplication4);
        System.out.println(number + " * " + "5" + " = " + multiplication5);
        System.out.println(number + " * " + "6" + " = " + multiplication6);
        System.out.println(number + " * " + "7" + " = " + multiplication7);
        System.out.println(number + " * " + "8" + " = " + multiplication8);
        System.out.println(number + " * " + "9" + " = " + multiplication9);
        System.out.println(number + " * " + "10" + " = " + multiplication10);

    }
}
