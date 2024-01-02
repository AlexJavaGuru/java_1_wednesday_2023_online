package student_slava_subacius.lesson_8_middle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5.0);
        System.out.println("Area of the triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
    }
}

