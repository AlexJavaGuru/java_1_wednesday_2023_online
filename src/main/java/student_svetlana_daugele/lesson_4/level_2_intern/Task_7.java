package student_svetlana_daugele.lesson_4.level_2_intern;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first integer number: ");
        int number1 = scanner.nextInt();

        System.out.print("Please enter the second integer number: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.print("Numbers are equals");
        }
        else {
            System.out.print("Numbers are different");
        }
    }
}
/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
 */