package teacher.lesson_4_if_statement.lessoncode.basictestapproach;

//380 ... 449 - Фиолетовый ("Violet")
//450 ... 494 - Синий ("Blue")
//495 ... 569 - Зеленый ("Green")
//570 ... 589 - Желтый ("Yellow")
//590 ... 619 - Оранжевый ("Orange")
//620 ... 750 - Красный ("Red")
//Вне диапазонов - невидимый спектр ("Invisible Light")
public class LightColorDetectorTest {

    public static void main(String[] args) {
        testVioletColorUpperRange();
        testVioletColorLowerRange();
    }

    public static void testVioletColorUpperRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = victim.detect(449);

        check(expectedResult, actualResult, "Test Violet Color Upper");
    }

    public static void testVioletColorLowerRange() {
        LightColorDetector victim = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = victim.detect(380);

        check(expectedResult, actualResult, "Test Violet Color Lower");
    }

    private static void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
