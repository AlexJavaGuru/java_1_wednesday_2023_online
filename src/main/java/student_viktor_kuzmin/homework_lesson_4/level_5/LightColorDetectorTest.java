package student_viktor_kuzmin.homework_lesson_4.level_5;


class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        testVioletColor();
        testBlueColor();
        testGreenColor();
        testYellowColor();
        testOrangeColor();
        testRedColor();
        testInvisibleLight();

    }

    private static void testVioletColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = victim.detect(380);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Violet color test has passed!");
        } else {
            System.out.println("Violet color test has failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    private static void testBlueColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = victim.detect(460);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Blue color test has passed!");
        } else {
            System.out.println("Blue color test has failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    private static void testGreenColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = victim.detect(520);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Green color test has passed!");
        } else {
            System.out.println("Green color test has failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    private static void testYellowColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = victim.detect(580);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Yellow color test has passed!");
        } else {
            System.out.println("Yellow color test has failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    private static void testOrangeColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = victim.detect(600);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Orange color test has passed!");
        } else {
            System.out.println("Orange color test has failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    private static void testRedColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = victim.detect(640);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Red color test has passed!");
        } else {
            System.out.println("Red color test has failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    private static void testInvisibleLight() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Invisible light";
        String actualResult = victim.detect(360);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Invisible light test has passed!");
        } else {
            System.out.println("Invisible light has failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}