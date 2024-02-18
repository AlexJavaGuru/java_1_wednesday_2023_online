package student_viktor_kuzmin.homework_lesson_8.level_4;

class CircleTest {
    public static void main(String[] args) {

        testCalculateArea();
        testCalculatePerimeter();
    }

    public static void testCalculateArea() {
        Circle circle = new Circle("Circle", 7.0);
        double expectedArea = Math.PI * 7.0 * 7.0;
        double actualArea = circle.calculateArea();
        if (Math.abs(expectedArea - actualArea) < 0.0001) {
            System.out.println("Test calculateArea passed");
        } else {
            System.out.println("Test calculateArea failed");
        }
    }

    public static void testCalculatePerimeter() {
        Circle circle = new Circle("Circle", 7.0);
        double expectedPerimeter = 2 * Math.PI * 7.0;
        double actualPerimeter = circle.calculatePerimeter();
        if (Math.abs(expectedPerimeter - actualPerimeter) < 0.0001) {
            System.out.println("Test calculatePerimeter passed");
        } else {
            System.out.println("Test calculatePerimeter failed");
        }
    }
}
