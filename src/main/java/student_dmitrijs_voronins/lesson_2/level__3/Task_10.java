package student_dmitrijs_voronins.lesson_2.level__3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type Radius :");

        double radiusDobleNumber = scanner.nextDouble();
        System.out.println("Radius = " + radiusDobleNumber);

        double perimeter = 2.0 * 3.14 * radiusDobleNumber;
        System.out.println("Perimeter is :" + perimeter);

        double area = 3.14 * (radiusDobleNumber * radiusDobleNumber);
        System.out.println("Area is :" + area);

    }
}
//Напишите программу, которая запрашивает у пользователя
//радиус круга (вещественное число) и печатает на консоль
//периметр и площадь круга.
//
//Test Data:
//Radius = 7.5
//
//Expected Output
//Perimeter is = 47.12388980384689                         (14)        P=2*PI+RADIUS P=2*3.14*7.5=47.1
//Area is = 176.71458676442586                             (14)        (A=PI*R(2)) A=3.14*(7.5*7.5)=176.62
//Task_10