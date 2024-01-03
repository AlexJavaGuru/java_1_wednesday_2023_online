package student_svetlana_daugele.lesson_8.level_4;
import java.util.Random;
class ShapeUtil {
    Circle createRandomCircle() {
        Random random = new Random();
        double radius = random.nextInt(10);
        String title = "Circle";
        return new Circle(title, radius);
    }

    Square createRandomSquare() {
        Random random = new Random();
        String title = "Square";
        int sideLength = random.nextInt(10);
        return new Square(title, sideLength);
    }


    Rectangle createRandomRectangle() {
        Random random = new Random();
        String title = "Rectangle";
        int length = random.nextInt(10);
        int width = random.nextInt(10);
        return new Rectangle(title, length, width);
    }

    EquilateralTriangle createRandomTriangle() {
        Random random = new Random();
        String title = "Equilateral Triangle";
        double sideLength = random.nextDouble();
        return new EquilateralTriangle(title,sideLength);
    }

    Shape createRandomShape() {
        Random random = new Random();
        int randomNumber = random.nextInt(4);
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

    double calculateArea(Shape[] shapes) {
        double totalArea = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }

        return totalArea;
    }

    double calculatePerimeter(Shape[] shapes){
        double totalPerimeter = 0.0;

        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }

        return totalPerimeter;
    }


    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}