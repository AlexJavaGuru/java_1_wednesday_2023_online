package teacher.lesson_3_oop_first_look.lessoncode;

public class CalcDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumResult = calculator.sum(10, 5);
        int subResult = calculator.sub(10, 5);
        int multResult = calculator.mult(10, 5);
        double divResult = calculator.div(10, 5);

        System.out.println(sumResult);
        System.out.println(subResult);
        System.out.println(multResult);
        System.out.println(divResult);
    }
}
