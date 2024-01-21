package student_artur_zaharov.lesson_6.level_5;

public class ComputerPlayer {
private TicTacToe ticTacToe;
public ComputerPlayer (TicTacToe ticTacToe){
    this.ticTacToe = ticTacToe;
}

public  Move getNextMove(int[][] field, int currentPlayer) {
    Move move;

    move = canWinNextMove(field, currentPlayer);
    if (move != null) {
        return move;
    }
    move = needToBlock(field, currentPlayer);
    if (move != null) {
        return move;
    }
    return getRandomMove(field);
}
    public Move canWinNextMove(int[][] field, int currentPlayer) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    field[i][j] = currentPlayer;
                    if (TicTacToe.isWinPosition(field, currentPlayer)) {
                        field[i][j] = -1; // Возвращаем поле в исходное состояние
                        return new Move(i, j);
                    }
                    field[i][j] = -1; // Возвращаем поле в исходное состояние
                }
            }
        }
        return null; // Нет возможности выиграть следующим ходом
    }

    public Move needToBlock(int[][] field, int opponentPlayer) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    field[i][j] = opponentPlayer;
                    if (TicTacToe.isWinPosition(field, opponentPlayer)) {
                        return new Move(i, j);
                    }
                        field[i][j] = -1; // Возвращаем поле в исходное состояние

                }
            }
        }
       // return null;
        Move move = canWinNextMove(field,0);
        if (move !=null){
            return move;
        }
        return null;
    }
    private Move getRandomMove(int[][] field) {
        int x, y;
        do {
            x = ticTacToe.getRandom().nextInt(3);
            y = ticTacToe.getRandom().nextInt(3);
        } while (field[x][y] != -1);
        return new Move(x, y);
    }
}