package student_svetlana_daugele.lesson_8.level_4;

class EquilateralTriangle extends Shape {
    private double sideLength;


    EquilateralTriangle(String title, double sideLength) {
        super(title);

        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return (Math.pow(sideLength, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 3;
    }
}
