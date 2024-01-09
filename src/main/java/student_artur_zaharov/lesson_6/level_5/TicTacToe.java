package student_artur_zaharov.lesson_6.level_5;

import java.util.Scanner;
import java.util.Random;

public class TicTacToe {


    private int[][] field;
    private Scanner scanner;
    private Random random;
    private ComputerPlayer computerPlayer;


    public TicTacToe() {
        this.field = createField();
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.computerPlayer = new ComputerPlayer(this);
        System.out.println("START THE GAME");
    }
    public Random getRandom() {
        return this.random;
    }

    public int[][] createField() {
        int size = 3;
        int[][] field = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = -1;
            }
        }

        return field;
    }

//    public void play() {
//        field = createField();
//        while (true) {
//            //printField();
//            Move move0 = getNextMove();
//            field[move0.getX()][move0.getY()] = 0;
//            printField();
//            if (isWinPosition(field, 0)) {
//                System.out.println("Player 0 WIN!");
//                break;
//            }
//            if (isDrawPosition(field)) {
//                System.out.println("DRAW!");
//                break;
//            }
//
//            //printField();
//            Move move1 = getNextMove();
//            field[move1.getX()][move1.getY()] = 1;
//            printField();
//            if (isWinPosition(field, 1)) {
//                System.out.println("Player 1 WIN!");
//                break;
//            }
//            if (isDrawPosition(field)) {
//                System.out.println("DRAW!");
//                break;
//            }
//        }
//    }

    public void play() {
        field = createField();
        while (true) {
            Move move0 = computerPlayer.getNextMove(field, 0); // Computer's move
            field[move0.getX()][move0.getY()] = 0;
            printField();
            if (isWinPosition(field, 0)) {
                System.out.println("Computer WINS!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            Move move1 = getNextMove(1); // Player's move
            field[move1.getX()][move1.getY()] = 1;
            printField();
            if (isWinPosition(field, 1)) {
                System.out.println("Player WINS!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public Move getNextMove(int currentPlayer) {
        if (currentPlayer == 0) {
            // Computer's move using ComputerPlayer's logic
            return computerPlayer.getNextMove(field, currentPlayer);
        } else {
            // Player's move (input from console)
            return getPlayerMove();
        }
    }

//    private Move getRandomMove() {
//        int x, y;
//        do {
//            x = random.nextInt(3);
//            y = random.nextInt(3);
//        } while (field[x][y] != -1);
//        return new Move(x, y);
//    }

    private Move getPlayerMove() {
        int x, y;
        Move move = null;

        do {
            System.out.println("Enter the row number (0-2): ");
            x = scanner.nextInt();

            System.out.println("Enter the column number (0-2): ");
            y = scanner.nextInt();

            if (field[x][y] == -1) {
                move = new Move(x, y);
            } else {
                System.out.println("This cell is already occupied, please choose a different one.");
            }
        } while (move == null);

        return move;
    }


    private void printField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != playerToCheck) {
                    break;
                } else if (j == field.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            boolean isWin = true;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] != playerToCheck) {
                   isWin = false;
                   break;
                }
                }
            if (isWin){
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isWinForDiagonalsTopToBottom(field, playerToCheck) ||
                isWinForDiagonalsBottomToTop(field, playerToCheck);
    }

    public static boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinForDiagonalsTopToBottom(field, playerToCheck) ||
                isWinForDiagonalsBottomToTop(field, playerToCheck) ||
                isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck);
    }


    public static boolean isWinForDiagonalsTopToBottom(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                break;
            } else if (i == field.length - 1) {
                return true;
            }

        }
        return false;
    }

    public static boolean isWinForDiagonalsBottomToTop(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - 1 - i] != playerToCheck) {
                return false;
            }
        }

        return true;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    return false;
                }

            }

        }
        if (isWinPosition(field, 0) || isWinPosition(field, 1)) {
            return false;
        }
        System.out.println("Round is Draw");
        return true;
    }
}