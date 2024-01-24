package student_viktor_kuzmin.homework_lesson_4.level_4;

public class Calculator {

    public int sum(int valueA, int valueB) {
        int result = valueA + valueB;
        return result;
    }

    public int sub(int valueA, int valueB) {
        int result = valueA - valueB;
        return result;
    }

    public int mult(int valueA, int valueB) {
        int result = valueA * valueB;
        return result;
    }

    public double div(int valueA, int valueB) {
        double result = valueA / (double) valueB;
        return result;
    }

    public boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int valueA, int valueB) {
        if (valueA > valueB) {
            return valueA;
        } else {
            return valueB;
        }
    }

    public int maxOfThreeNumbers(int valueA, int valueB, int valueC) {
        if ((valueA > valueB) && (valueA > valueC)) {
            return valueA;
        } else if ((valueB > valueA) && (valueB > valueC)) {
            return valueB;
        } else if ((valueC > valueA) && (valueC > valueB)) {
            return valueC;
        } else if ((valueA == valueB) && (valueA > valueC)) {
            return valueA;
        } else if ((valueB == valueC) && (valueB > valueA)) {
            return valueB;
        } else if ((valueA == valueC) && (valueA > valueB)) {
            return valueC;
        } else {
            return valueA;

        }

    }
}











