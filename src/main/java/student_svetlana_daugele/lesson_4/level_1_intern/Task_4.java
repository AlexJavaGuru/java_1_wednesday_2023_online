package student_svetlana_daugele.lesson_4.level_1_intern;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the integer number : ");
        int integerNumber = scanner.nextInt();

        if (integerNumber % 2 == 0) {
            System.out.print("The number " + integerNumber + " is even number. ");
        }
        else  {
            System.out.print("The number " + integerNumber + " is odd.");
        }
    }

}


