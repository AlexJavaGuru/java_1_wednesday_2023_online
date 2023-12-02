package student_svetlana_daugele.lesson_4.level_2_intern;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first integer number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Please enter the second integer number, which is different from the first one: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.print(firstNumber);
        }

        else {
            System.out.print(secondNumber);
        }
    }
}
/*Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.*/