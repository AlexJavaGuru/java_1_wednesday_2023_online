package student_slava_subacius;

import java.util.Scanner;
    public class homework_10 {

        public static void main(String[] args){
            System.out.println(" Please, enter the radius :");

            Scanner scanner = new Scanner(System.in);
            double radius = scanner.nextDouble();

            double perimeter = 2 * Math.PI * radius ;
            double area = Math.PI * radius * radius;


            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = "+ area);

        }
    }
