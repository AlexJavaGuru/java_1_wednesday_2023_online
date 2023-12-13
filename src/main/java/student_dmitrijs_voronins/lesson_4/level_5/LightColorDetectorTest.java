package student_dmitrijs_voronins.lesson_4.level_5;

//380 ... 449 - Фиолетовый ("Violet")
//450 ... 494 - Синий ("Blue")
//495 ... 569 - Зеленый ("Green")
//570 ... 589 - Желтый ("Yellow")
//590 ... 619 - Оранжевый ("Orange")
//620 ... 750 - Красный ("Red")
class LightColorDetectorTest {

    public static void main(String[] args) {
        testVioletColor();
        testBlueColor();
        testGreenColor();
        testYellowColor();
        testOrangeColor();
        testRedColor();


    }

    public static void testVioletColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = victim.detect(381);
        check(expectedResult, actualResult, "Test Violet Color");

    }

    private static void check(String expectedResult, String actialResult, String testName) {
        if (expectedResult.equals(actialResult)) {
            System.out.println(testName + "Violet passed!");
        } else {
            System.out.println(testName + "Failed");
            System.out.println("Expected: " + expectedResult + "but Actual: " + actialResult);
        }

    }
    public static void testBlueColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = victim.detect(493);
        check1(expectedResult, actualResult, "Test Blue Color");

    }

    private static void check1(String expectedResult, String actialResult, String testName) {
        if (expectedResult.equals(actialResult)) {
            System.out.println(testName + "Blue passed!");
        } else {
            System.out.println(testName + "Failed");
            System.out.println("Expected: " + expectedResult + "but Actual: " + actialResult);
        }

    }
    public static void testGreenColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = victim.detect(568);
        check2(expectedResult, actualResult, "Test Green Color");

    }

    private static void check2(String expectedResult, String actialResult, String testName) {
        if (expectedResult.equals(actialResult)) {
            System.out.println(testName + "Green passed!");
        } else {
            System.out.println(testName + "Failed");
            System.out.println("Expected: " + expectedResult + "but Actual: " + actialResult);
        }

    }
    public static void testYellowColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = victim.detect(589);
        check3(expectedResult, actualResult, "Test Yellow Color");

    }

    private static void check3(String expectedResult, String actialResult, String testName) {
        if (expectedResult.equals(actialResult)) {
            System.out.println(testName + "Yellow passed!");
        } else {
            System.out.println(testName + "Failed");
            System.out.println("Expected: " + expectedResult + "but Actual: " + actialResult);
        }

    }
    public static void testOrangeColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = victim.detect(600);
        check4(expectedResult, actualResult, "Test Orange Color");

    }

    private static void check4(String expectedResult, String actialResult, String testName) {
        if (expectedResult.equals(actialResult)) {
            System.out.println(testName + "Orange passed!");
        } else {
            System.out.println(testName + "Failed");
            System.out.println("Expected: " + expectedResult + "but Actual: " + actialResult);
        }

    }
    public static void testRedColor() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = victim.detect(620);
        check5(expectedResult, actualResult, "Test Red Color");

    }

    private static void check5(String expectedResult, String actialResult, String testName) {
        if (expectedResult.equals(actialResult)) {
            System.out.println(testName + "Red passed!");
        } else {
            System.out.println(testName + "Failed");
            System.out.println("Expected: " + expectedResult + "but Actual: " + actialResult);
        }

    }


}