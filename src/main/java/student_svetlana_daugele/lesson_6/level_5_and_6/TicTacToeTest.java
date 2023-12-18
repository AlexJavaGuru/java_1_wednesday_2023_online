package student_svetlana_daugele.lesson_6.level_5_and_6;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.testIsWinPositionForHorizontalsNoWin();
        ticTacToeTest.testIsWinPositionForHorizontalsWinForZero();
        ticTacToeTest.testIsWinPositionForHorizontalsWinForOnes();
        ticTacToeTest.testIsWinPositionForVerticalForOnes();
        ticTacToeTest.testIsWinPositionForVerticalForZero();
        ticTacToeTest.testIsWinPositionForVerticalsNoWin();
        ticTacToeTest.testIsWinPositionForDiagonalNoWin();
        ticTacToeTest.testIsWinPositionForDiagonalWinForZero();
        ticTacToeTest.testIsWinPositionForDiagonalWinForOnes();
        ticTacToeTest.testIsWinPositionForOnes();
        ticTacToeTest.testIsWinPositionForZero();
        ticTacToeTest.testIsWinPositionNoWin();
        ticTacToeTest.testIsDrayPositionTrue();
        ticTacToeTest.testIsDrayPositionFalse();
        ticTacToeTest.shouldCreateField();

    }

    private void shouldCreateField() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = ticTacToe.createField();

        if (field == null) {
            System.out.println("Field Create Test is failed:field is null.");
            return;
        }

        if (field.length != 3) {
            System.out.println("Field Create Test is failed: Incorrect number of rows.");
            return;
        }

        for (int i = 0; i < field.length; i++) {
            if (field[i].length != 3) {
                System.out.println("Field Create Test is failed: : Incorrect number of columns in row.");
                return;
            }
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != -1) {
                    System.out.println("Field CreateTest is failed: Cell (" + i + ", " + j + ") is not -1.");
                    return;
                }
            }
        }

        System.out.println("Field Create test has passed.");
    }


    private void testIsDrayPositionTrue() {

        int[][] field = {{0, 1, 0},
                { 1,0,0},
                { 1,0,1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isDrawPosition(field);
        checkB(result, "Test 13");
    }
    private void testIsDrayPositionFalse() {

        int[][] field = {{-1, 1, 0},
                { 1,0,0},
                { 1,0,1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isDrawPosition(field);
        checkB(!result, "Test 14");
    }

    public void testIsWinPositionNoWin() {
        int[][] field = {{-1, 0, 0},
                { 1,-1,-1},
                { 0,-1,0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPosition(field, 0);
        checkB(!result, "Test 12");
    }
    private void testIsWinPositionForZero() {
        int[][] field = {{0, 0, 0},
                { 0,-1,-1},
                { 1, 1, 1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPosition(field, 0);
        checkB(result, "Test 11");
    }

    private void testIsWinPositionForOnes() {
        int[][] field = {{-1, 0, 0},
                { 0,-1,-1},
                { 1, 1, 1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPosition(field, 1);
        checkB(result, "Test 10");
    }

    public void testIsWinPositionForHorizontalsNoWin() {
        int[][] field = {{-1, 0, 0},
                { 1,-1,-1},
                { 0,-1,-1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 0);
        checkB(!result, "Test 1");
    }

    public void testIsWinPositionForHorizontalsWinForZero() {
        int[][] field = {{-1, 0, 0},
                { 0,-1,-1},
                { 0, 0, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 0);
        checkB(result, "Test 2");
    }

    public void testIsWinPositionForHorizontalsWinForOnes() {
        int[][] field = {{-1, 0, 0},
                { 1, 1, 1},
                { 0,-1, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 1);
        checkB(result, "Test 3");
    }
private void testIsWinPositionForVerticalForOnes(){
    int[][] field = {{1, 0, 0},
            {1, 1, 1},
            {1, -1, 0}};

    TicTacToe ticTacToe = new TicTacToe();
    boolean result = ticTacToe.isWinPositionForVerticals(field, 1);
    checkB(result, "Test 4");

}
    private void testIsWinPositionForVerticalForZero(){
        int[][] field = {{1, 0, 0},
                {1, 1, 0},
                {1, -1, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForVerticals(field, 0);
        checkB(result, "Test 5");

    }
    public void testIsWinPositionForVerticalsNoWin() {
        int[][] field = {{-1, 0, 0},
                { 1,-1,-1},
                { 0,-1,-1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForVerticals(field, 0);
        checkB(!result, "Test 6");
    }
    public void testIsWinPositionForDiagonalNoWin() {
        int[][] field = {{-1, 0, 0},
                { 1,-1,-1},
                { 0,-1,0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForDiagonals(field, 0);
        checkB(!result, "Test 7");
    }
    public void testIsWinPositionForDiagonalWinForZero() {
        int[][] field = {{-1, 0, 0},
                { 1,0,-1},
                { 0,-1,0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForDiagonals(field, 0);
        checkB(result, "Test 8");
    }
    public void testIsWinPositionForDiagonalWinForOnes() {
        int[][] field = {{-1, 0, 1},
                { 1,1,-1},
                { 1,-1,0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForDiagonals(field, 1);
        checkB(result, "Test 9");
    }
    private void checkS(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    private void checkB(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed");
            System.out.println("Expected: true" + " but Actual: " + actualResult);
        }
    }

}
