package teacher.lesson_7_encapsulation.lessoncode.TicTacToeAlisa;

class Move {
    private int x;
    private int y;
    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
