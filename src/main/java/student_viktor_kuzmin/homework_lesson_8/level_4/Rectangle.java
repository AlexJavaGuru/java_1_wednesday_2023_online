package student_viktor_kuzmin.homework_lesson_8.level_4;

class Rectangle extends Shape {

    private final double sideA;
    private final double sideB;

    Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }


    @Override
    double calculatePerimeter() {
        {
            return ((2 * sideA) + (2 * sideB));
        }
    }


}
