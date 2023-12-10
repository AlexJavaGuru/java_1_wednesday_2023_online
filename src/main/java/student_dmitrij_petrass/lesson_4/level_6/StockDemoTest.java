package student_dmitrij_petrass.lesson_4.level_6;

class StockDemoTest {






    private void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed!");
        }
    }
}
