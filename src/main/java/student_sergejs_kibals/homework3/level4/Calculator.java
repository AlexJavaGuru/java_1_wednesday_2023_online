package student_sergejs_kibals.homework3.level4;

class Calculator {

    public int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber, int equalNumbers) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return equalNumbers;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber, int equalNumbers) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            return secondNumber;
        } else if (thirdNumber == firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else {
            return equalNumbers;
        }
    }
}
