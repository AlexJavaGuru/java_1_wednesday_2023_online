package student_artur_zaharov.lesson_3.Level2;

import java.util.Scanner;

public class ScannerDemo_Username {
    public static void main(String[] args) {

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();

        System.out.println("Hello Username - " + name1 + "!");
    }

}
