package student_slava_subacius;

import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();
       int num3 = scanner.nextInt();
        double num = (double) (num1 + num2 + num3) / 3;
        System.out.println("result : " + num);


    }
}
