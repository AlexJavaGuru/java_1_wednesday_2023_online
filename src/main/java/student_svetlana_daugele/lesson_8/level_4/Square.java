package student_svetlana_daugele.lesson_8.level_4;

class Square extends Shape {
    private double sideLength;

    Square(String title,double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }


    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return 4 * sideLength;
    }
}
