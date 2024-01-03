package student_svetlana_daugele.lesson_8.level_4;

class ShapeTest {

    public static void main(String[] args) {
        ShapeTest shapeTest = new ShapeTest();
        shapeTest.circlePerimeterTest("Circle perimeter test", 50.27);
        shapeTest.circleAreaTest("Circle area test", 201.06);
        shapeTest.rectanglePerimeterTest("Rectangle perimeter test", 24);
        shapeTest.rectangleAreaTest("Rectangle area test", 32);
        shapeTest.squarePerimeterTest("Square area test", 32);
        shapeTest.squareAreaTest("Square area test", 64);
        shapeTest.triangleAreaTest("Triangle area test", 16);
        shapeTest.trianglePerimeterTest("Triangle perimeter test", 19.313708);
        shapeTest.trianglePerimeterTest("Triangle perimeter test", 19.313708);
    }

    private void squareAreaTest(String testName, double expectedResult) {
        Square square =  new Square("Square", 8);
        double result = square.calculateArea();
        printTestResult(testName, expectedResult, result);
    }

    private void squarePerimeterTest(String testName, double expectedResult) {
        Square square =  new Square("Square", 8);
        double result = square.calculatePerimeter();
        printTestResult(testName, expectedResult, result);
    }

    private void rectangleAreaTest(String testName, double expectedResult) {
        Rectangle rectangle = new Rectangle("Recrtangle", 8,4);
        double result = rectangle.calculateArea();
        printTestResult(testName, expectedResult, result);
    }

    private void rectanglePerimeterTest(String testName, double expectedResult) {
        Rectangle rectangle = new Rectangle("Recrtangle", 8,4);
        double result = rectangle.calculatePerimeter();
        printTestResult(testName, expectedResult, result);
    }

    private void circleAreaTest(String testName, double expectedResult) {
        Circle newCircle = new Circle("Circle",8);
        double result = newCircle.calculateArea();
        printTestResult(testName, expectedResult, result);
    }


    private void circlePerimeterTest(String testName, double expectedResult) {
        Circle newCircle = new Circle("Circle",8);
        double result = newCircle.calculatePerimeter();
        printTestResult(testName, expectedResult, result);

    }

    private void triangleAreaTest(String testName, double expectedResult) {
        Triangle newTriangle = new Triangle("Triangle1", 8,4, 5.656854,5.656854,8);

        double result = newTriangle.calculateArea();
        printTestResult(testName, expectedResult, result);
        }



    private void trianglePerimeterTest(String testName, double expectedResult) {
        Triangle newTriangle = new Triangle("Triangle1", 8,4, 5.656854,5.656854,8);

        double result = newTriangle.calculatePerimeter();
        printTestResult(testName, expectedResult, result);
    }
    private void printTestResult(String testName, double expectedResult, double result){
        double roundedExpectedResult = Math.round(expectedResult * 100.0) / 100.0;
        double roundedResult = Math.round(result * 100.0) / 100.0;
        if (roundedExpectedResult ==roundedResult){
            System.out.println (testName + " is OK");
        } else {
            System.out.println (testName + " is FALSE");
        }
    }

}
