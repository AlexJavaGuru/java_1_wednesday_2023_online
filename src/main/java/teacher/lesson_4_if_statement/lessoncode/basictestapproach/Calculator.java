package teacher.lesson_4_if_statement.lessoncode.basictestapproach;

public class Calculator {

    public boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

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
}
