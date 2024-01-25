package student_viktor_kuzmin.homework_lesson_5.level_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedAr = 7;
        int[] array = arrayUtil.createArray(7);
        if (array.length == expectedAr) {
            System.out.println("Array length test is OK");
        } else {
            System.out.println("Array length test FAILED");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 3, 5, 7, 9, 8, 6};
        int expectedResult = 9;
        int maxNumber = arrayUtil.findMaxNumber(array);
        if (expectedResult == maxNumber) {
            System.out.println("Find Max number test is OK");
        } else {
            System.out.println("Find Max number test is FAILED");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {5, 2, 1, 7, 9, 8, 6};
        int expectedResult = 1;
        int minNumber = arrayUtil.findMinNumber(array);
        if (expectedResult == minNumber) {
            System.out.println("Find Min number test is OK");
        } else {
            System.out.println("Find Min number test is FAILED");
        }
    }

}


