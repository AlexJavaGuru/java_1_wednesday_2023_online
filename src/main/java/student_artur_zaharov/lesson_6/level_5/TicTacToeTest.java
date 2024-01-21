package student_artur_zaharov.lesson_6.level_5;

public class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.testIsWinPositionForHorizontalsNoWin();
        ticTacToeTest.testIsWinPositionForHorizontalsWinForZero();
        ticTacToeTest.testIsWinPositionForHorizontalsWinForOnes();
        ticTacToeTest.testIsWinPositionForDiagonalsWinTopToBottom();
        ticTacToeTest.testIsWinPositionForDiagonalsWinBottomToTop();
        ticTacToeTest.testWin1();
        ticTacToeTest.testWin2();
        ticTacToeTest.testDraw();
    }

    public void testIsWinPositionForHorizontalsNoWin() {
        int[][] field = {{-1, 0, 0},
                         { 1,-1,-1},
                         { 0,-1,-1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 0);
        check(!result, "Test 1");
    }

    public void testIsWinPositionForHorizontalsWinForZero() {
        int[][] field = {{-1, 0, 0},
                         { 0,-1,-1},
                         { 0, 0, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 0);
        check(result, "Test 2");
    }

    public void testIsWinPositionForHorizontalsWinForOnes() {
        int[][] field = {{-1, 0, 0},
                         { 1, 1, 1},
                         { 0,-1, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 1);
        check(result, "Test 3");
    }
    public void testIsWinPositionForDiagonalsWinTopToBottom() {
        int[][] field = { {1, 0, 0},
                         { 1, 1, 0},
                         { 0,-1, 1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForDiagonals(field, 1);
        check(result, "Test WIN Diagonal TopToBottom");
    }

    public void testIsWinPositionForDiagonalsWinBottomToTop() {
        int[][] field = { {0, 0, 1},
                         { 1, 1, 0},
                         { 1,-1, 3}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForDiagonals(field, 1);
        check(result, "Test WIN Diagonal BottomToTop");
    }

    public void testWin1() {
        int[][] field = { {1, 0, 1},
                        { 1, -1, 0},
                         { 1,-1, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPosition(field, 1);
        check(result, "Test WIN Vertical_isWinPosition");
    }
    public void testWin2() {
        int[][] field = { {1, 0, 0},
                         { 1, 0, 1},
                         { 0,-1, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPosition(field, 0);
        check(result, "Test WIN BottomToTop_isWinPosition");
    }

    public void testDraw() {
        int[][] field = { {1, 0, 1},
                        { 1, 0, 1},
                        { 0, 1, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isDrawPosition(field);
        check(result, "Test Draw Working");
    }


    private void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    private void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed");
            System.out.println("Expected: true" + " but Actual: " + actualResult);
        }
    }

}
