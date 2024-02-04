package student_aleksandrs_jeleckis.lesson_6.level_5;
class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();

        test.testCreateField();
        test.testDrawPositionTrue();
        test.testDrawPositionFalse();
        test.testWinPositionFalse();
        test.testWinPositionOne();
        test.testWinPositionZero();
        test.testWinPositionForHorizontalsFalse();
        test.testWinPositionForHorizontalsZero();
        test.testWinPositionForHorizontalsOne();
        test.testWinPositionForVerticalsFalse();
        test.testWinPositionForVerticalsZero();
        test.testWinPositionForVerticalsOne();
        test.testWinPositionForDiagonalsFalse();
        test.testWinPositionForDiagonalsZero();
        test.testWinPositionForDiagonalsOne();
    }

    public void testCreateField() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = ticTacToe.createField();
        boolean result = true;

        if (field == null || field.length != 3) {
            result = false;
        }

        for (int i = 0; i < field.length; i++) {
            if (field[i].length != 3) {
                result = false;
            }
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != -1) {
                    result = false;
                }
            }
        }

        checkResult(result, "Create Field test");
    }

    public void testDrawPositionTrue() {
        int[][] field = {{1, 0, 1}, {0, 0, 1}, {1, 1, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isDrawPosition(field);
        checkResult(result, "True Draw Position test");
    }

    public void testDrawPositionFalse() {
        int[][] field = {{-1, 1, 0}, {1, 0, 0}, {1, 0, -1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isDrawPosition(field);
        checkResult(!result, "False Draw Position test");
    }

    public void testWinPositionFalse() {
        int[][] field = {{-1, -1, 0}, {0, -1, -1}, {0, -1, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPosition(field, 0);
        checkResult(!result, "False Win Position test");
    }

    public void testWinPositionZero() {
        int[][] field = {{0, 0, 0}, {-1, -1, -1}, {-1, -1, -1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPosition(field, 0);
        checkResult(result, "First Player True Win Position test");
    }

    public void testWinPositionOne() {
        int[][] field = {{-1, -1, 1}, {1, 1, 1}, {-1, -1, -1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPosition(field, 1);
        checkResult(result, "Second Player True Win Position test");
    }

    public void testWinPositionForHorizontalsFalse() {
        int[][] field = {{1, -1, 0}, {1, -1, 0}, {1, -1, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 0);
        checkResult(!result, "Horizontal False Win Position test");
    }

    public void testWinPositionForHorizontalsZero() {
        int[][] field = {{-1, -1, -1}, {0, 0, 0}, {-1, -1, -1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 0);
        checkResult(result, "First Player Horizontal Win Position test");
    }

    public void testWinPositionForHorizontalsOne() {
        int[][] field = {{-1, -1, -1}, {1, 1, 1}, {-1, -1, -1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 1);
        checkResult(result, "Second Player Horizontal Win Position test");
    }

    public void testWinPositionForVerticalsFalse() {
        int[][] field = {{-1, -1, -1}, {-1, -1, -1}, {0, 0, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForVerticals(field, 0);
        checkResult(!result, "False Vertical Win Position test");
    }

    public void testWinPositionForVerticalsZero() {
        int[][] field = {{-1, 0, -1}, {-1, 0, -1}, {-1, 0, -1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForVerticals(field, 0);
        checkResult(result, "First Player Vertical Win Position test");
    }

    public void testWinPositionForVerticalsOne() {
        int[][] field = {{1, -1, -1}, {1, -1, -1}, {1, -1, -1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForVerticals(field, 1);
        checkResult(result, "Second Player Vertical Win Position test");
    }

    public void testWinPositionForDiagonalsFalse() {
        int[][] field = {{-1, 0, -1}, {-1, 0, -1}, {-1, 0, -1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForDiagonals(field, 0);
        checkResult(!result, "False Diagonal Win Position test");
    }

    public void testWinPositionForDiagonalsZero() {
        int[][] field = {{-1, -1, 0}, {-1, 0, -1}, {0, -1, -1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForDiagonals(field, 0);
        checkResult(result, "First Player Diagonal Win Position test");
    }

    public void testWinPositionForDiagonalsOne() {
        int[][] field = {{1, -1, -1},
                {-1, 1, -1},
                {-1, -1, 1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean result = ticTacToe.isWinPositionForDiagonals(field, 1);
        checkResult(result, "Second Player Diagonal Win Position test");
    }

    private void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}