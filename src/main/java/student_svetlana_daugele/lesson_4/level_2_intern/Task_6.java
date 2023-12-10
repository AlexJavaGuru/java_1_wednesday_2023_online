package student_svetlana_daugele.lesson_4.level_2_intern;

import java.util.Scanner;

class Task_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first integer number: ");
        int number1 = scanner.nextInt();

        System.out.print("Please enter the second integer number, which is different from the first one: ");
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            System.out.print(number1);
        }
        else {
            System.out.print(number2);
        }
    }
}
/*Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.*/