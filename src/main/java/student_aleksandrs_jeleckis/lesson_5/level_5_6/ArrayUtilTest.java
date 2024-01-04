package student_aleksandrs_jeleckis.lesson_5.level_5_6;

class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int expLength = 5;

        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = arrayTest.createArray(5);

        if (array.length == expLength) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void shouldFindMaxNumber() {
        int expNum = 10;
        int[] array = {1, 5, 10, 7};

        ArrayUtil arrayTest = new ArrayUtil();

        if (arrayTest.findMaxNumber(array) == expNum) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void shouldFindMinNumber() {
        int expNum = 1;
        int[] array = {1, 5, 10, 7};

        ArrayUtil arrayTest = new ArrayUtil();

        if (arrayTest.findMinNumber(array) == expNum) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}

