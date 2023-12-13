package student_aleksandra_azbuka.lesson_4;
import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("First number is the biggest one: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Second number is the biggest one: " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Third number is the biggest one: " + secondNumber);
        } else {
            System.out.println("Some numbers are equal");
        }
        scanner.close();
    }
}
