package student_aleksandrs_jeleckis.lesson_6.level_3;

 class ArrayServiceTest {


    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();

        test.containsTest();
        test.notContainsTest();
        test.occursTest();
        test.notOccursTest();
        test.replacedTest();
        test.notReplacedTest();
    }

    public void containsTest() {
        ArrayService service = new ArrayService();

        int arr[] = {1, 2, 3};
        boolean actualResult = service.contains(arr, 1);
        boolean expectedResult = true;
        checkTestResult(actualResult == expectedResult, "Contains");
    }

    public void notContainsTest() {
        ArrayService service = new ArrayService();

        int arr[] = {1, 2, 3};
        boolean actualResult = service.contains(arr, 4);
        boolean expectedResult = false;
        checkTestResult(actualResult == expectedResult, "Outside array");
    }

    public void occursTest() {
        ArrayService service = new ArrayService();

        int arr[] = {1, 2, 3, 3};
        int actualResult = service.countOccurrences(arr, 3);
        int expectedResult = 2;

        checkTestResult(actualResult == expectedResult, "Number occurs");
    }

    public void notOccursTest() {
        ArrayService service = new ArrayService();

        int arr[] = {1, 2, 3, 3};
        int actualResult = service.countOccurrences(arr, 7);
        int expectedResult = 0;

        checkTestResult(actualResult == expectedResult, "Number doesn't occur");
    }

    public void replacedTest() {
        ArrayService service = new ArrayService();

        int arr[] = {1, 2, 3, 3};
        boolean actualResult = service.replaceFirst(arr,2,0);
        boolean expectedResult = true;

        checkTestResult(actualResult == expectedResult, "Number replaced");
    }

    public void notReplacedTest() {
        ArrayService service = new ArrayService();

        int arr[] = {1, 2, 3, 3};
        boolean actualResult = service.replaceFirst(arr,8,8);
        boolean expectedResult = false;

        checkTestResult(actualResult == expectedResult, "Number not replaced");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}
