package student_aleksandra_azbuka.lesson_4;
import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("First number is bigger than second: " + firstNumber);
        } else if (firstNumber < secondNumber){
            System.out.println("Second number is bigger: " + secondNumber);
        }
        else {
            System.out.println("Number are equal");
        }
        scanner.close();
    }
}
