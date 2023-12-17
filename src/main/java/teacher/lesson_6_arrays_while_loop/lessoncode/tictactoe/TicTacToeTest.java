package teacher.lesson_6_arrays_while_loop.lessoncode.tictactoe;

public class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.testIsWinPositionForHorizontalsNoWin();
        ticTacToeTest.testIsWinPositionForHorizontalsWinForZero();
        ticTacToeTest.testIsWinPositionForHorizontalsWinForOnes();
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
