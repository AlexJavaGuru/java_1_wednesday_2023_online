package student_slava_subacius.lesson_4_5;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        testVioletColorUpperRange();
        testVioletColorLowerRange();
        testBlueColorUpperRange();
        testBlueColorLowerRange();
        testGreenColorUpperRange();
        testGreenColorLowerRange();
        testYellowColorUpperRange();
        testYellowColorLowerRange();
        testOrangeColorUpperRange();
        testOrangeColorLowerRange();
        testRedColorUpperRange();
        testRedColorLowerRange();
        testInvisibleLight();
    }

    private static void testInvisibleLight() {
    }

    public static void testVioletColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = victim.detect(380);

        check(expectedResult, actualResult, "Test Violet Color Upper");
    }

    public static void testVioletColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = victim.detect(449);

        check(expectedResult, actualResult, "Test Violet Color Lower");
    }


    public static void testBlueColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = victim.detect(450);

        check(expectedResult, actualResult, "Test Blue Color Upper");
    }

    public static void testBlueColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = victim.detect(494);

        check(expectedResult, actualResult, "Test Blue Color Lower");
    }

    public static void testGreenColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = victim.detect(495);

        check(expectedResult, actualResult, "Test Green Color Upper");
    }

    public static void testGreenColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = victim.detect(569);

        check(expectedResult, actualResult, "Test Green Color Lower");
    }
    public static void testYellowColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = victim.detect(570);

        check(expectedResult, actualResult, "Test Yellow Color Upper");
    }

    public static void testYellowColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = victim.detect(589);

        check(expectedResult, actualResult, "Test Yellow Color Lower");
    }
    public static void testOrangeColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = victim.detect(590);

        check(expectedResult, actualResult, "Test Orange Color Upper");
    }

    public static void testOrangeColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = victim.detect(619);

        check(expectedResult, actualResult, "Test Orange Color Lower");
    }
    public static void testRedColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = victim.detect(620);

        check(expectedResult, actualResult, "Test Red Color Upper");
    }

    public static void testRedColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = victim.detect(750);

        check(expectedResult, actualResult, "Test Red Color Lower");
    }

    public static void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}


