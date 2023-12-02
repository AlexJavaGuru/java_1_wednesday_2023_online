package student_svetlana_daugele.lesson_4.level_3_junior;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first integer number: ");
        int number1 = scanner.nextInt();

        System.out.print("Please enter the second integer number: ");
        int number2 = scanner.nextInt();

        System.out.print("Please enter the third integer number: ");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.print(number1);
        }
        else if (number2 > number1 && number2 > number3) {
            System.out.print(number2);
        }
        else  if (number3 > number1 && number3 > number2){
            System.out.print(number3);
        }
        else {
            System.out.print("You enetered 3 equial numbers!");
        }
    }
}
