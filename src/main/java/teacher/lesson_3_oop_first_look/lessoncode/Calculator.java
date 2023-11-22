package teacher.lesson_3_oop_first_look.lessoncode;

public class Calculator {

    //Тут происходит сложение двух чисел
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
