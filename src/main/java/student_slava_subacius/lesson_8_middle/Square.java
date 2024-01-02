package student_slava_subacius.lesson_8_middle;

class Square extends Shape {

    private double side;
    Square(double side) {
        this.side = side;
    }
    @Override
    double calculateArea() {
        return side * side;
    }
    @Override
    double calculatePerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }
}
