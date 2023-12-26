package student_aleksandra_azbuka.lesson_5;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.randomArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }
    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedArrayLength = 5;
        int[] array = arrayUtil.createArray(5);
        if (array.length == expectedArrayLength) {
            System.out.println("Test shouldCreateArray is passed.  Array length is " + array.length);
        } else {
            System.out.println("Test shouldCreateArray is failed. Array length is " + array.length);
        }
    }

    public void randomArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedArrayLength = 10;
        int[] array = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(array);
        if (expectedArrayLength == array.length) {
            System.out.println("Test RandomArray is passed. Array length is " + array.length);
            arrayUtil.printArrayToConsole(array);
            System.out.println();
        } else {
            System.out.println("Test RandomArray is failed");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 10, 3, 6};
        int expectedMaxNumber = 10;
        int maxNumber = arrayUtil.findMaxNumber(array);
        if (expectedMaxNumber == maxNumber) {
            System.out.println("Test findMaxNumber passed. Max number is " + maxNumber);
        } else {
            System.out.println("Test findMaxNumber failed");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {22, 33, 1, 66, 7};
        int expectedMinNumber = 1;
        int minNumber = arrayUtil.findMinNumber(array);
        if (expectedMinNumber == minNumber) {
            System.out.println("Test findMinNumber passed. Min number is " + minNumber);
        } else {
            System.out.println("Test findMinNumber failed");
        }
    }
}
