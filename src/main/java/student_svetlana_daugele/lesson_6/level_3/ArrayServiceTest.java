package student_svetlana_daugele.lesson_6.level_3;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        int[] arr = {1, 2, 3, 6, 4, 5, 6, 7, 1};
        arrayServiceTest.containsTest("Contains number Test", arr, 5);
        arrayServiceTest.containsNoTest("Contains No Number Test", arr, 9);
        arrayServiceTest.countOccuriencesTest("Count Occuriences Test", arr, 6, 2);
        arrayServiceTest.replaceFirstTest ("Replace First Test", arr, 6,8);
        arrayServiceTest.replaceAllTest("Replace all Test",arr,1,9,2);
        arrayServiceTest.sortTest();
        arrayServiceTest.revertTest();
    }

    private void revertTest() {
        ArrayService arrayService = new ArrayService();
        System.out.print(" Initial array: ");
        int[] arr = {9, 8, 1, 5, 6, 3, 4, 2};
        arrayService.printArray(arr);
        arrayService.revert(arr);
        System.out.print(" Revert order: ");
        arrayService.printArray(arr);
    }


    private void sortTest() {
        ArrayService arrayService = new ArrayService();
        System.out.print("Initial array: ");
        int[] arr = {9, 8, 7, 5, 6, 3, 4, 2};
        arrayService.printArray(arr);
        arrayService.sort(arr);
        System.out.print(" Sorted order: ");
        arrayService.printArray(arr);
        }

    private void replaceAllTest(String testName, int [] arr,int numberToReplace,int newNumber,int expectedResult) {
            ArrayService arrayService = new ArrayService();
            int result = arrayService.replaceAll(arr, numberToReplace, newNumber);
            checkTestResultInt (result, expectedResult, testName);
    }

    private void replaceFirstTest(String testName, int [] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        Boolean expectedResult = true;
        Boolean result = arrayService.replaceFirst (arr, numberToReplace, newNumber);
        checkTestResult(result, expectedResult, testName);
    }

    public void countOccuriencesTest(String testName, int[] arr, int numberToSearch, int expectedResult) {
        ArrayService arrayService = new ArrayService();
        int result = arrayService.countOccurrences(arr, numberToSearch);
        checkTestResultInt(result, expectedResult, testName);
    }

    public void containsTest(String testName, int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        Boolean expectedResult = true;
        Boolean result = arrayService.contains(arr, numberToSearch);
        checkTestResult(result, expectedResult, testName);
    }

    public void containsNoTest(String testName, int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        Boolean expectedResult = false;
        Boolean result = arrayService.contains(arr, numberToSearch);
        checkTestResult(result, expectedResult, testName);
    }

    private void checkTestResult(boolean result, boolean expectedResult, String testName) {
        if (expectedResult == result) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    private void checkTestResultInt(int result, int expectedResult, String testName) {
        if (expectedResult == result) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}



