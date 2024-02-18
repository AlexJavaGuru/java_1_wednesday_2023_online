package student_viktor_kuzmin.homework_lesson_8.level_4;

class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(new Shape[]{circle});
        double circlePerimeter = shapeUtil.calculatePerimeter(new Shape[]{circle});
        System.out.println("Random circle area is " + circleArea);
        System.out.println("Random circle perimeter is " + circlePerimeter);


        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(new Shape[]{rectangle});
        double rectanglePerimeter = shapeUtil.calculatePerimeter(new Shape[]{rectangle});
        System.out.println("Random rectangle area is " + rectangleArea);
        System.out.println("Random rectangle perimeter is " + rectanglePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(new Shape[]{square});
        double squarePerimeter = shapeUtil.calculatePerimeter(new Shape[]{square});
        System.out.println("Random square area is " + squareArea);
        System.out.println("Random square perimeter is " + squarePerimeter);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(new Shape[]{triangle});
        double trianglePerimeter = shapeUtil.calculatePerimeter(new Shape[]{triangle});
        System.out.println("Random triangle area is " + triangleArea);
        System.out.println("Random triangle perimeter is " + trianglePerimeter);
    }
}
