package student_svetlana_daugele.lesson_8.level_4;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle area is " + circleArea);
        System.out.println("Circle perimeter is " + circlePerimeter);

        Shape equilateralTriangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(equilateralTriangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(equilateralTriangle);
        System.out.println("Triangle area is " + triangleArea);
        System.out.println("Triangle perimeter is " + trianglePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter =shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Rectangle area is " + rectangleArea);
        System.out.println("Rectangle perimeter is " + rectanglePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter =shapeUtil.calculatePerimeter(square);
        System.out.println("Square area is " + squareArea);
        System.out.println("Square perimeter is " + squarePerimeter);

    }

}
