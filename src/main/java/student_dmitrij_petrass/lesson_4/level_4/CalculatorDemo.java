package student_dmitrij_petrass.lesson_4.level_4;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int firstNumber = 5;
        int secondNumber = 10;
        int number = 7;


        System.out.println("SUM: " + calculator.sum(firstNumber, secondNumber));
        System.out.println("Subtract: " + calculator.subtract(firstNumber, secondNumber));
        System.out.println("Multiply: " + calculator.multiply(firstNumber, secondNumber));
        System.out.println("Divide: " + calculator.divide(firstNumber, secondNumber));
        System.out.println("MaxOfTwoNumbers = " + calculator.maxOfTwoNumbers(firstNumber, secondNumber));
        System.out.println("Number is Even = " + calculator.isEven(number));
    }
}
