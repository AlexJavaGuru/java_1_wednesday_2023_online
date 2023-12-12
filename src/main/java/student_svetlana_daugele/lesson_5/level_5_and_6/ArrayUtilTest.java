package student_svetlana_daugele.lesson_5.level_5_and_6;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        ArrayUtil arrayUtil = new ArrayUtil();
        test.shouldCreateArray();
        test.shoudFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedArrayLength = 10;
        int[] array = arrayUtil.createArray(10);
        if (array.length == expectedArrayLength) {
            System.out.println("Array length is " + array.length + ". Array length test is ok. Array is created");
        } else {
            System.out.println("Array length test failed");
        }
    }

    public void shoudFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedArrayLength = 10;
        int[] array = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);//print random array to console
        if (expectedArrayLength == array.length) {
            System.out.println("Array length is " + array.length + ". Array length test is ok.");
        } else {
            System.out.println("Array lenghth test failed");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {3, 6, 7, 9, 2};
        int expectedMaxNumber = 9;
        int maxNumber = arrayUtil.findMaxNumber(array);
        if (expectedMaxNumber == maxNumber) {
            System.out.println("Max number test is ok. Max number is " + maxNumber);
        } else {
            System.out.println("Max test is failed");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {3, 8, 1, 9, 4};
        int expectedMinNumber = 1;
        int minNumber = arrayUtil.findMinNumber(array);
        if (expectedMinNumber == minNumber) {
            System.out.println("Min number test is ok. Min number is " + minNumber);
        } else {
            System.out.println("Min test is failed");
        }

    }
}
