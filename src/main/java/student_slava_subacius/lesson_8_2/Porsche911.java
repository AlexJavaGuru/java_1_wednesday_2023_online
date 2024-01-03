package student_slava_subacius.lesson_8_2;

class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public String toString() {
        return "Porsche911 releaseYear = " + getReleaseYear() + ", topSpeed = " + topSpeed + ' ';
    }
}
