package student_slava_subacius.lesson_8_middle;

class Triangle extends Shape {
    private double sideLength;
    Triangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * sideLength;
    }

    public double getSideLength() {
        return sideLength;

     }
}

