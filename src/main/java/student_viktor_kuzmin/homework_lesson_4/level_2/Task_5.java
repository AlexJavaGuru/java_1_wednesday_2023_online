package student_viktor_kuzmin.homework_lesson_4.level_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter integer 2: ");
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println(number1);
        } else if (number1 < number2) {
            System.out.println(number2);
        } else {
            System.out.println("They are equals");
        }scanner.close();
    }
}
