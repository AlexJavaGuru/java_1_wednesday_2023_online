package student_dmitrijs_voronins;

import java.util.Scanner;

public class avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number :");
        double number1 = scanner.nextDouble();

        System.out.println("Second number :");
        double number2 = scanner.nextDouble();

        System.out.println("Third number :");
        double number3 = scanner.nextDouble();

        double avarage = (number1 + number2 + number3);

        System.out.println("Avarage :");
        double avarage1 = avarage / 3;
        System.out.println(avarage1);


    }
}
//Напишите программу, которая запрашивает у пользователя
//три целых числа и выводит их среднее арифметическое
//(складывает все числа и делит на их количество).
//
//Примечение: обратите внимание, что результат может быть дробным числом.

//Task 11