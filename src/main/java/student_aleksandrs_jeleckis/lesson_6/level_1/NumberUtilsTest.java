package student_aleksandrs_jeleckis.lesson_6.level_1;

class NumberUtilsTest {

    public static void main(String[] args) {

        NumberUtilsTest test = new NumberUtilsTest();
        test.evenTest();
        test.unEvenTest();
    }

    void evenTest() {

        boolean expResult = true;

        NumberUtils even = new NumberUtils();

        if (even.isEven(2) == expResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test not passed");
        }
    }

    void unEvenTest() {

        boolean expResult = false;

        NumberUtils even = new NumberUtils();

        if (even.isEven(1) == expResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test not passed");
        }
    }
}
