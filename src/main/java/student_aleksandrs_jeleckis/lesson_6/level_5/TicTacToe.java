package student_aleksandrs_jeleckis.lesson_6.level_5;

import java.util.Scanner;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean winPosition = false;
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == playerToCheck &&
                    field[i][1] == playerToCheck &&
                    field[i][2] == playerToCheck) {
                winPosition = true;
            }
        }
        return winPosition;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean winPosition = false;
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == playerToCheck &&
                    field[1][i] == playerToCheck &&
                    field[2][i] == playerToCheck) {
                winPosition = true;
            }
        }
        return winPosition;
    }


    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean winPosition = false;
        if (field[0][0] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck ||
                field[0][2] == playerToCheck &&
                        field[1][1] == playerToCheck &&
                        field[2][0] == playerToCheck) {
            winPosition = true;
        }
        return winPosition;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean winPosition = false;
        if (isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck)) {
            winPosition = true;
        }
        return winPosition;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                if (field[row][column] == -1) {
                    return false;
                }
            }
        }

        if (!isWinPosition(field, 0) && !isWinPosition(field, 1)) {
            return true;
        }

        return false;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
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

            Move move1 = getNextMove();
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
}