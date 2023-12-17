package student_artur_zaharov.lesson_4.level5;

import teacher.lesson_4_if_statement.lessoncode.basictestapproach.LightColorDetector;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        testVioleteColorUp();
        testVioleteColorDown();
        testBlueColorUp();
        testBlueColorDown();
        testGreenColorUp();
        testGreenColorDown();
        testYellowColorUp();
        testYellowColorDown();
        testOrangeColorUp();
        testOrangeColorDown();
        testRedColorUp();
        testRedColorDown();
        testInvisibleLightUp();
        testInvisibleLightColorDown();

    }

    public static void testVioleteColorUp () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Violet";
        String realResult = victim.detect (380);
        check(expectedResult, realResult, "Test Violet Up");

        }
    public static void testVioleteColorDown () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Violet";
        String realResult = victim.detect (449);
        check(expectedResult, realResult, "Test Violet Down");

    }

    public static void testBlueColorUp () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Blue";
        String realResult = victim.detect (450);
        check(expectedResult, realResult, "Test Blue Up");

    }
    public static void testBlueColorDown () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Blue";
        String realResult = victim.detect(494);
        check(expectedResult, realResult, "Test Blue Down");

    }

    public static void testGreenColorUp () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Green";
        String realResult = victim.detect (495);
        check(expectedResult, realResult, "Test Green Up");

    }
    public static void testGreenColorDown () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Green";
        String realResult = victim.detect(569);
        check(expectedResult, realResult, "Test Green Down");

    }

    public static void testYellowColorUp () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Yellow";
        String realResult = victim.detect (570);
        check(expectedResult, realResult, "Test Yellow Up");

    }
    public static void testYellowColorDown () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Yellow";
        String realResult = victim.detect(589);
        check(expectedResult, realResult, "Test Yellow Down");

    }

    public static void testOrangeColorUp () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Orange";
        String realResult = victim.detect (590);
        check(expectedResult, realResult, "Test Orange Up");

    }
    public static void testOrangeColorDown () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Orange";
        String realResult = victim.detect(619);
        check(expectedResult, realResult, "Test Orange Down");

    }

    public static void testRedColorUp () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Red";
        String realResult = victim.detect (620);
        check(expectedResult, realResult, "Test Red Up ");

    }
    public static void testRedColorDown () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Red";
        String realResult = victim.detect(750);
        check(expectedResult, realResult, "Test Red Down");

    }

    public static void testInvisibleLightUp () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Invisible Light";
        String realResult = victim.detect (751);
        check(expectedResult, realResult, "Test Invisible Light Up");

    }
    public static void testInvisibleLightColorDown () {
        LightColorDetector1 victim = new LightColorDetector1();
        String expectedResult = "Invisible Light";
        String realResult = victim.detect(379);
        check(expectedResult, realResult, "Test Invisible Light Down");

    }


    private static void check (String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " has PASSED!!");
        } else{
            System.out.println(testName + " has FAILED!!");
        }
    }
}

