package student_svetlana_daugele.lesson_2.level_1;

public class Task_2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The result of multiplication is: " + multiplication);
        System.out.println("The result of division is: " + division);
    }

}
