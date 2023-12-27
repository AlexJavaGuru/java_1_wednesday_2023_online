package student_aleksandrs_jeleckis.lesson_2.level_3;

import java.util.Scanner;

 class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write down number");

        int firstNumber = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(firstNumber * i);
        }

    }
}