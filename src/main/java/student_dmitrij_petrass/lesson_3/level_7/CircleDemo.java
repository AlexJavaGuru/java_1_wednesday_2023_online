package student_dmitrij_petrass.lesson_3.level_7;

import java.awt.geom.Area;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        double radius = circle.getRadius();
        double area = circle.calculateArea();

        System.out.println("Circle Radius = " + radius);
        System.out.println("Circle Area = " + area);

    }
}
