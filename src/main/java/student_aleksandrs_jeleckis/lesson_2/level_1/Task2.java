package student_aleksandrs_jeleckis.lesson_2.level_1;

import java.util.Scanner;
 class Task2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write down first decimal number");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Please write down second decimal number");
        double secondDoubleNumber = scanner.nextDouble();


            System.out.println("Results");
            System.out.println(firstDoubleNumber + secondDoubleNumber);
            System.out.println(firstDoubleNumber - secondDoubleNumber);
            System.out.println(firstDoubleNumber / secondDoubleNumber);
            System.out.println(firstDoubleNumber * secondDoubleNumber);

    }
}
