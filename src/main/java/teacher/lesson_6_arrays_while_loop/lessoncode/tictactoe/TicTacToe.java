package teacher.lesson_6_arrays_while_loop.lessoncode.tictactoe;

class TicTacToe {

    /*
    -1  1  1
     1 -1 -1
     0 -1  0

     playerToCheck = 1
     */
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean isWinForHorizontals = true;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != playerToCheck) {
                    isWinForHorizontals = false;
                    break;
                } else if (j == field.length - 1) {
                    isWinForHorizontals = true;
                    return isWinForHorizontals;
                }
            }
        }
        return isWinForHorizontals;
    }

    boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isWinForDiagonalsTopToBottom(field, playerToCheck) ||
                isWinForDiagonalsBottomToTop(field, playerToCheck);
    }


        /*
    -1  1  1
     1 -1 -1
     0 -1  0

        field [0][0]; i = 0
        field [1][1]; i = 1
        field [2][2]; i = 2

     playerToCheck = 1
     */

    private boolean isWinForDiagonalsTopToBottom(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                return false;
            }
        }
        return true;
    }


        /*
    -1  1  1
     1 -1 -1
     0 -1  0

        field [0][2]; i = 0
        field [1][1]; i = 1
        field [2][0]; i = 2

     playerToCheck = 1
     */

    private boolean isWinForDiagonalsBottomToTop(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - 1 - i] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

}












