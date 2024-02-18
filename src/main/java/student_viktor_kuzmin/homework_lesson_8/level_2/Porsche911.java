package student_viktor_kuzmin.homework_lesson_8.level_2;

public class Porsche911 extends Car {

    private final int topSpeed;


    public int getTopSpeed() {
        return topSpeed;
    }

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}
