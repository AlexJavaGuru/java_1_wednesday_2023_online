package student_slava_subacius.lesson_8_middle;

public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Circle randomCircle = shapeUtil.createRandomCircle();

        System.out.println("Random Circle - Radius: " + randomCircle.getRadius() +
                ", Area: " + randomCircle.calculateArea() +
                ", Perimeter: " + randomCircle.calculatePerimeter());

        Square randomSquare = shapeUtil.createRandomSquare();
        System.out.println("Random Square - Side: " + randomSquare.getSide() +
                ", Area: " + randomSquare.calculateArea() +
                ", Perimeter: " + randomSquare.calculatePerimeter());


        Rectangle randomRectangle = shapeUtil.createRandomRectangle();
        System.out.println("Random Rectangle - Width: " + randomRectangle.getWidth() +
                ", Height: " + randomRectangle.getHeight() +
                ", Area: " + randomRectangle.calculateArea() +
                ", Perimeter: " + randomRectangle.calculatePerimeter());


        Triangle randomTriangle = shapeUtil.createRandomTriangle();
        System.out.println("Random Triangle - sideLength: " + randomTriangle.getSideLength() +
                ", Area: " + randomTriangle.calculateArea() +
                ", Perimeter: " + randomTriangle.calculatePerimeter());


        Shape randomShape = shapeUtil.createRandomShape();
        System.out.println("Random Shape: " + randomShape.getClass().getSimpleName());


        Shape[] shapesArray = new Shape[5];
        shapesArray[0] = shapeUtil.createRandomCircle();
        shapesArray[1] = shapeUtil.createRandomSquare();
        shapesArray[2] = shapeUtil.createRandomRectangle();
        shapesArray[3] = shapeUtil.createRandomTriangle();
        shapesArray[4] = shapeUtil.createRandomShape();


        double totalArea = shapeUtil.calculateArea(shapesArray);
        System.out.println("Total Area of Shapes: " + totalArea);

        double totalPerimeter = shapeUtil.calculatePerimeter(shapesArray);
        System.out.println("Total Perimeter of Shapes: " + totalPerimeter);
    }

}


