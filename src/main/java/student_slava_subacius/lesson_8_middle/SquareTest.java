package student_slava_subacius.lesson_8_middle;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        System.out.println("Square 1 - Area: " + square.calculateArea()
                + ", Perimeter: " + square.calculatePerimeter());
    }
}
