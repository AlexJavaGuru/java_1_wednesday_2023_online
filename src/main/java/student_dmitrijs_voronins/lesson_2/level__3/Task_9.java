package student_dmitrijs_voronins.lesson_2.level__3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");

        int expectedOutput = scanner.nextInt();
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int number6 = 6;
        int number7 = 7;
        int number8 = 8;
        int number9 = 9;
        int number10 = 10;
        int multiplie = expectedOutput * number1;
        System.out.println(expectedOutput +"*"+ number1 +"="+ multiplie  );

        int multiplie2 = expectedOutput * number2;
        System.out.println(expectedOutput +"*"+ number2 +"="+ multiplie2  );

        int multiplie3 = expectedOutput * number3;
        System.out.println(expectedOutput +"*"+ number3 +"="+ multiplie3  );

        int multiplie4 = expectedOutput * number4;
        System.out.println(expectedOutput +"*"+ number4 +"="+ multiplie4  );

        int multiplie5 = expectedOutput * number5;
        System.out.println(expectedOutput +"*"+ number5 +"="+ multiplie5  );

        int multiplie6 = expectedOutput * number6;
        System.out.println(expectedOutput +"*"+ number6 +"="+ multiplie6  );

        int multiplie7 = expectedOutput * number7;
        System.out.println(expectedOutput +"*"+ number7 +"="+ multiplie7  );

        int multiplie8 = expectedOutput * number8;
        System.out.println(expectedOutput +"*"+ number8 +"="+ multiplie8  );

        int multiplie9 = expectedOutput * number9;
        System.out.println(expectedOutput +"*"+ number9 +"="+ multiplie9  );

        int multiplie10 = expectedOutput * number10;
        System.out.println(expectedOutput +"*"+ number10 +"="+ multiplie10  );

    }
}
//Напишите программу, которая запрашивает у пользователя целое число
//и печатает на консоль таблицу умножения для этого числа до 10.
//
//Test Data:
//Input a number: 8
//
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80
//Task_9