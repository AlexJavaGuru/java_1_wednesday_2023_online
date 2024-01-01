package teacher.lesson_7_encapsulation.lessoncode.TicTacToeAlisa;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int row = 0; row < field.length; row++) {
            if (field[row][0] == playerToCheck &&
                    field[row][1] == playerToCheck &&
                    field[row][2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int column = 0; column < field.length; column++) {
            if (field[0][column] == playerToCheck &&
                    field[1][column] == playerToCheck &&
                    field[2][column] == playerToCheck) {
                return true;
            }
        }
        return false;
    }


    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck) {
            return true;
        }
        if (field[0][2] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][0] == playerToCheck) {
            return true;
        }

        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) == true ||
                isWinPositionForDiagonals(field, playerToCheck) == true ||
                isWinPositionForVerticals(field, playerToCheck) == true;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                if (field[row][column] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];

        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                field[row][column] = -1;
            }
        }

        return field;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coordinate X: ");
        int x = scanner.nextInt();

        System.out.print("Enter the coordinate Y: ");
        int y = scanner.nextInt();

        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                int cell = field[i][j];
                if (cell == -1) {
                    System.out.print("- ");
                } else {
                    System.out.print(cell + " ");
                }
            }
            System.out.println();
        }
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }


            Move move1 = getNextMoveAI(field, 1);
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public Move getNextMoveAI(int[][] field, int playerForAI) {
        int[][] fieldCopy = copyField(field);
//        int enemy;
//        if (playerForAI == 0) {
//            enemy = 1;
//        } else {
//            enemy = 0;
//        }
        int enemy = playerForAI == 0 ? 1 : 0;
        int countFreeCells = countFreeCells(fieldCopy);

        while (countFreeCells > 0) {
            Move potentialMove = makeAnyPossibleMoveFromOpponent(fieldCopy);
            if (potentialMove != null) {
                fieldCopy[potentialMove.getX()][potentialMove.getY()] = enemy;
                if (isWinPosition(fieldCopy, enemy)) {
                    return potentialMove;
                } else {
                    fieldCopy[potentialMove.getX()][potentialMove.getY()] = -5;
                }
            } else {
                return getRandomMove(fieldCopy);
            }
            countFreeCells--;
        }
        return getRandomMove(fieldCopy);
    }

    private Move getRandomMove(int[][] fakeField) {
        Random random = new Random();
        Move move;
        do {
            move = new Move(random.nextInt(3), random.nextInt(3));
        } while (fakeField[move.getX()][move.getY()] == -1);
        return move;
    }

    private int countFreeCells(int[][] fieldCopy) {
        int count = 0;
        for (int i = 0; i < fieldCopy.length; i++) {
            for (int j = 0; j < fieldCopy.length; j++) {
                if (fieldCopy[i][j] == -1) {
                    count++;
                }
            }
        }
        return count;
    }

    private static Move makeAnyPossibleMoveFromOpponent(int[][] fieldCopy) {
        for (int i = 0; i < fieldCopy.length; i++) {
            for (int j = 0; j < fieldCopy.length; j++) {
                if (fieldCopy[i][j] == -1) {
                    return new Move(i, j);
                }
            }
        }
        return null;
    }

    private int[][] copyField(int[][] field) {
        int[][] copyField = new int[field.length][field[0].length];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                copyField[i][j] = field[i][j];
            }
        }
        return copyField;
    }
}
