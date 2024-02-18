package student_viktor_kuzmin.homework_lesson_8.level_4;

class RectangleTest {

    public static void main(String[] args) {

        testCalculateArea();
        testCalculatePerimeter();
    }

    public static void testCalculateArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 6);
        double expectedArea = 30;
        double actualArea = rectangle.calculateArea();
        if (expectedArea == actualArea) {
            System.out.println("Test calculateArea passed");
        } else {
            System.out.println("Test calculateArea failed");
        }
    }

    public static void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle("Square", 5, 6);
        double expectedPerimeter = 22;
        double actualPerimeter = rectangle.calculatePerimeter();
        if (expectedPerimeter == actualPerimeter) {
            System.out.println("Test calculatePerimeter passed");
        } else {
            System.out.println("Test calculatePerimeter failed");
        }
    }
}

