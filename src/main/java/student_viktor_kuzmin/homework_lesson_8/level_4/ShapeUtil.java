package student_viktor_kuzmin.homework_lesson_8.level_4;

import java.util.Random;

class ShapeUtil {

    private static final Random random = new Random();

    public Circle createRandomCircle() {
        double radius = random.nextDouble() * 100;
        String title = "Circle";
        return new Circle(title, radius);
    }

    public Square createRandomSquare() {
        double sideLength = random.nextDouble() * 100;
        String title = "Square";
        return new Square(title, sideLength);
    }

    public Rectangle createRandomRectangle() {
        double sideA = random.nextDouble() * 100;
        double sideB = random.nextDouble() * 100;
        String title = "Rectangle";
        return new Rectangle(title, sideA, sideB);
    }

    public Triangle createRandomTriangle() {
        double sideLength = random.nextDouble() * 100;
        String title = "Triangle";
        return new Triangle(title, sideLength);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    public double calculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

        public double calculatePerimeter(Shape[] shapes) {
            double totalPerimeter = 0;
            for (Shape shape : shapes) {
                totalPerimeter += shape.calculatePerimeter();
            }
            return totalPerimeter;
        }


}
