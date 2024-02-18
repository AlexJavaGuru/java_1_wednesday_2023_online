package student_viktor_kuzmin.homework_lesson_8.level_4;

class SquareTest {
    public static void main(String[] args) {

        testCalculateArea();
        testCalculatePerimeter();
    }

    public static void testCalculateArea() {
        Square square = new Square("Square", 6);
        double expectedArea = 36;
        double actualArea = square.calculateArea();
        if (expectedArea == actualArea) {
            System.out.println("Test calculateArea passed");
        } else {
            System.out.println("Test calculateArea failed");
        }
    }

    public static void testCalculatePerimeter() {
        Square square = new Square("Square", 6);
        double expectedPerimeter = 24;
        double actualPerimeter = square.calculatePerimeter();
        if (expectedPerimeter == actualPerimeter) {
            System.out.println("Test calculatePerimeter passed");
        } else {
            System.out.println("Test calculatePerimeter failed");
        }
    }
}


