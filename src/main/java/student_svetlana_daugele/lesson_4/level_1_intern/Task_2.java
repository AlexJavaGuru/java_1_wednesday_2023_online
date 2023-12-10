package student_svetlana_daugele.lesson_4.level_1_intern;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer number: ");
        int integerNumber = scanner.nextInt();


        if (integerNumber > 0) {
                System.out.print("The number " + integerNumber + " is a positive integer. ");
            }
        else if (integerNumber < 0) {
                System.out.print("The number " + integerNumber + " is a negative integer.");
            }
        else {
                System.out.print("The number " + integerNumber + " is zero. ");
            }

    }
}
