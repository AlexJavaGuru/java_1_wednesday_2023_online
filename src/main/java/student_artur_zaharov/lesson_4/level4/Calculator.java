package student_artur_zaharov.lesson_4.level4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double div(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEvenT(int firstNumber) {
        if (firstNumber % 2 == 0) {
            return true;
        }
        return false;
    }

    public String maxOfTwoNumbers(int firstNumber, int secondNumber) {
        String result;
        if (firstNumber > secondNumber) {
            result = "firstNumber bolwe secondNumber";

        } else if (firstNumber == secondNumber) {
            result = "firstNumber ravno secondNumber";

        } else {
            result = "firstNumber menwe secondNumber";
        }
        return result;

    }
    public String threeNumber(int firstNumber, int secondNumber, int thirdNumber) {
        String result2 = null;
        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            result2 = "First number bolwe vseh";
        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            result2 = "Second number bolwe vseh";
        } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
            result2 = "Third number bolwe vseh";
        } else if ((firstNumber == secondNumber) && (firstNumber > thirdNumber) && (secondNumber > thirdNumber)) {
            result2 = "first and second equal and more than third number";
        } else if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
            result2 = "tri chisla ravni";
        }
        return result2;
    }
}




