package student_svetlana_daugele.lesson_8.level_4;

class Rectangle extends Shape {
    private double sideLengthA;
    private double sideLengthB;

    Rectangle(String title,double sideLengthA, double sideLengthB) {
        super(title);
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
    }


    @Override
    double calculateArea() {
        return sideLengthA * sideLengthB;
    }

    @Override
    double calculatePerimeter() {
        return 2 * sideLengthA + 2 * sideLengthB;
    }
}
