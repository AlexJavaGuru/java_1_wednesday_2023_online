package student_dmitrij_petrass.lesson_4.level_5;

class LightColorDetectorTest {
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
        testInvisibleLightColorUpperRange();
        testInvisibleLightColorLowerRange();
    }

    public static void testVioletColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = victim.detect(449);

        check(actualResult, expectedResult, "Test 1: Violet upper Range");
    }

    public static void testVioletColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = victim.detect(380);

        check(actualResult, expectedResult, "Test 1: Violet lower Range");
    }
    public static void testBlueColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = victim.detect(494);

        check(actualResult, expectedResult, "Test 2: Blue upper Range");
    }

    public static void testBlueColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = victim.detect(450);

        check(actualResult, expectedResult, "Test 2: Blue lower Range");
    }
    public static void testGreenColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = victim.detect(569);

        check(actualResult, expectedResult, "Test 3: Green upper Range");
    }

    public static void testGreenColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = victim.detect(495);

        check(actualResult, expectedResult, "Test 3: Green lower Range");
    }
    public static void testYellowColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = victim.detect(589);

        check(actualResult, expectedResult, "Test 4: Yellow upper Range");
    }

    public static void testYellowColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = victim.detect(570);

        check(actualResult, expectedResult, "Test 4: Yellow lower Range");
    }
    public static void testOrangeColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = victim.detect(619);

        check(actualResult, expectedResult, "Test 5: Orange upper Range");
    }

    public static void testOrangeColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = victim.detect(590);

        check(actualResult, expectedResult, "Test 5: Orange lower Range");
    }
    public static void testRedColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = victim.detect(750);

        check(actualResult, expectedResult, "Test 6: Red upper Range");
    }

    public static void testRedColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = victim.detect(620);

        check(actualResult, expectedResult, "Test 6: Red lower Range");
    }
    public static void testInvisibleLightColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "InvisibleLight";
        String actualResult = victim.detect(751);

        check(actualResult, expectedResult, "Test 7: InvisibleLight upper Range");
    }

    public static void testInvisibleLightColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "InvisibleLight";
        String actualResult = victim.detect(379);

        check(actualResult, expectedResult, "Test 7: InvisibleLight lower Range");
    }


    private static void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed!");
        }
    }



}


