package student_viktor_kuzmin.homework_lesson_8.level_4;

class ShapeUtilTest {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();

        testCalculateArea(shapeUtil);
        testCalculatePerimeter(shapeUtil);
    }

    public static void testCalculateArea(ShapeUtil shapeUtil) {
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double totalArea = shapeUtil.calculateArea(shapes);

        if (totalArea >= 0) {
            System.out.println("Calculate area test passed");
        } else {
            System.out.println("Calculate area test failed");
        }
    }

    public static void testCalculatePerimeter(ShapeUtil shapeUtil) {
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double totalPerimeter = shapeUtil.calculatePerimeter(shapes);

        if (totalPerimeter >= 0) {
            System.out.println("Calculate perimeter test passed");
        } else {
            System.out.println("Calculate perimeter test failed");
        }
    }
}

