package student_aleksandra_azbuka.lesson_4;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            return secondNumber;
        }
        else return thirdNumber;
        }
    }

