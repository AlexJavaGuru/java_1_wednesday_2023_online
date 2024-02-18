package student_viktor_kuzmin.homework_lesson_8.level_4;

public class Triangle extends Shape {

    private double sideLength;

    Triangle(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(3) / 4 * sideLength * sideLength;
    }


    @Override
    double calculatePerimeter() {
        return 3 * sideLength;
    }


}
