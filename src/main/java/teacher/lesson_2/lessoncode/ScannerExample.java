package teacher.lesson_2.lessoncode;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Alex typed - " + firstNumber);
    }
}
