package student_artur_zaharov.lesson_2.level_3_junior;

import java.util.Scanner;

public class ZA_Task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valueA = scanner.nextInt();
        int valueB = scanner.nextInt();
        int valueC = scanner.nextInt();


        double result = valueA + valueB + valueC;

        System.out.println (result / 3);


    }
}