package student_viktor_kuzmin.homework_lesson_8.level_4;

class TriangleTest {

    public static void main(String[] args) {

        testCalculateArea();
        testCalculatePerimeter();
    }

    public static void testCalculateArea() {
        Triangle triangle = new Triangle("Triangle", 7);
        double expectedArea = Math.sqrt(3) / 4 * 7 * 7;
        double actualArea = triangle.calculateArea();
        if (expectedArea == actualArea) {
            System.out.println("Test calculateArea passed");
        } else {
            System.out.println("Test calculateArea failed");
        }
    }

    public static void testCalculatePerimeter() {
        Triangle triangle = new Triangle("Triangle", 7);
        double expectedPerimeter = 21;
        double actualPerimeter = triangle.calculatePerimeter();
        if (expectedPerimeter == actualPerimeter) {
            System.out.println("Test calculatePerimeter passed");
        } else {
            System.out.println("Test calculatePerimeter failed");
        }
    }
}
