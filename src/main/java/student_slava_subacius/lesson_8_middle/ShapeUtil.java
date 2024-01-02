package student_slava_subacius.lesson_8_middle;

import java.util.Random;

public class ShapeUtil {
    private static final Random random = new Random();

    public Circle createRandomCircle() {
        double radius = random.nextDouble() * 100;
        return new Circle(radius);
    }

    public Square createRandomSquare() {
        double side = random.nextDouble() * 5;
        return new Square(side);
    }

    public Rectangle createRandomRectangle() {
        double height = random.nextDouble() * 4;
        double width = random.nextDouble() * 4;
        return new Rectangle(width, height);
    }

    public Triangle createRandomTriangle() {
        double sideLength = random.nextDouble() * 5;
        return new Triangle(sideLength);
    }

    public Shape createRandomShape() {
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
    public double calculateArea (Shape[]shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            totalArea += area;
            System.out.println(shape.getClass().getSimpleName() + " - Area: " + area);
        }
        return totalArea;
    }
        public double calculatePerimeter(Shape[] shapes) {
            double totalPerimeter = 0.0;
            for (Shape shape : shapes) {
                double perimeter = shape.calculatePerimeter();
                totalPerimeter += perimeter;
                System.out.println(shape.getClass().getSimpleName() + " - Perimeter: " + perimeter);
            }
            return totalPerimeter;
        }

            public double calculateArea(Shape shape) {
                return shape.calculateArea();
            }

            public double calculatePerimeter(Shape shape) {
                return shape.calculatePerimeter();

    }
}



