package student_svetlana_daugele.lesson_8.level_4;

public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.testCalculateArea();
        shapeUtilTest.testCalculatePerimeter();
    }

    public void testCalculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double calculatedArea = calculateTotalArea(shapes);
        double expectedArea = shapeUtil.calculateArea(shapes);
        System.out.println ("Total Expected Area is  " + expectedArea );
        System.out.println ("Total Calculated Area is  " + calculatedArea );

        if (expectedArea == calculatedArea) {
            System.out.println ("Area test is OK" );

        }else{
            System.out.println ("Area test is FALSE" );
        }
    }

        public void testCalculatePerimeter() {
            ShapeUtil shapeUtil = new ShapeUtil();
            Shape[] shapes = new Shape[4];
            shapes[0] = shapeUtil.createRandomCircle();
            shapes[1] = shapeUtil.createRandomSquare();
            shapes[2] = shapeUtil.createRandomRectangle();
            shapes[3] = shapeUtil.createRandomTriangle();

            double calculatedPerimeter = calculateTotalPerimeter(shapes);
            double expectedPerimeter = shapeUtil.calculatePerimeter(shapes);
            System.out.println ("Total Expected Perimeter is  " + expectedPerimeter );
            System.out.println ("Total Calculated Perimeter is  " + calculatedPerimeter );

            if (expectedPerimeter == calculatedPerimeter) {

                System.out.println ("Perimeter test is OK" );

            }else{
                System.out.println ("Perimeter test is FALSE" );
            }

        }

        private double calculateTotalArea(Shape[] shapes) {
            double totalArea = 0.0;
            for (Shape shape : shapes) {
                totalArea += shape.calculateArea();
            }
            return totalArea;
        }

        private double calculateTotalPerimeter(Shape[] shapes) {
            double totalPerimeter = 0.0;
            for (Shape shape : shapes) {
                totalPerimeter += shape.calculatePerimeter();
            }
            return totalPerimeter;
        }

    }
