package student_dmitrijs_voronins.lesson_2.Level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Input second number");            //(soutp before input)
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;   //(+)
        System.out.println(sum);

        System.out.println("Input first number: ");
        int thirdNumber = scanner.nextInt();

        System.out.println("Input second number");
        int forthNumber = scanner.nextInt();

        int subtract = thirdNumber - forthNumber;  //(-)
        System.out.println(subtract);

        System.out.println("Input first number: ");
        int fifthNumber = scanner.nextInt();

        System.out.println("Input second number");
        int sixthNumber = scanner.nextInt();

        int multiplie = fifthNumber * sixthNumber;  //(-)
        System.out.println(multiplie);

        System.out.println("Input first number: ");
        int seventhNumber = scanner.nextInt();

        System.out.println("Input second number");
        int eighthNumber = scanner.nextInt();

        int devide = seventhNumber / eighthNumber;  //((/)
        System.out.println(devide);
    }
}
 //Написать консольную программу, которая запрашивает у пользователя два целых числа и
//выводит на консоль результаты: сложения, вычитания, умножения и деления.
//
//1. Создать класс с нужным именем;
//2. Создать описать main метод;
//3. Воспользуйтесь специальным классом Scanner и его методом nextInt()
// для получения ввода с клавиатуры
//          Scanner scanner = new Scanner(System.in);
//          int firstNumber = scanner.nextInt();
//4. Запишите полученные результаты в переменные;
//5. При помощи System.out.println() выведите на консоль полученные результаты
// сложения, вычитания, умножения и деления.
// (каждый результат на новой строке отдельно).