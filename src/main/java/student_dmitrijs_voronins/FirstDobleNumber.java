package student_dmitrijs_voronins;

import java.util.Scanner;

public class FirstDobleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Input second number");            //(soutp before input)
        double secondDobleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber + secondDobleNumber;   //(+)
        System.out.println(sum);

        System.out.println("Input first number: ");
        double thirdDoubleNumber = scanner.nextDouble();

        System.out.println("Input second number");
        double forthDobleNumber = scanner.nextDouble();

        double subtract = thirdDoubleNumber - forthDobleNumber;  //(-)
        System.out.println(subtract);

        System.out.println("Input first number: ");
        double fifthDoubleNumber = scanner.nextDouble();

        System.out.println("Input second number");
        double sixthDobleNumber = scanner.nextDouble();

        double multiplie = fifthDoubleNumber * sixthDobleNumber;  //(*)
        System.out.println(multiplie);

        System.out.println("Input first number: ");
        double seventhDoubleNumber = scanner.nextDouble();

        System.out.println("Input second number");
        double eighthDobleNumber = scanner.nextDouble();

        double devide = seventhDoubleNumber / eighthDobleNumber;  //((/)
        System.out.println(devide);

    }
}

//Написать консольную программу, которая запрашивает у пользователя два = comp
// вещественных числа
//(числа с запятой) и выводит на консоль результаты: сложения, вычитания, = (doble)comp
// умножения и деления.
//Вещественные числа можно запрашивать с консоли используя обьект Scanner = comp
//следующим образом:
//
//    Scanner scanner = new Scanner(System.in);
//    double firstDoubleNumber = scanner.nextDouble();
