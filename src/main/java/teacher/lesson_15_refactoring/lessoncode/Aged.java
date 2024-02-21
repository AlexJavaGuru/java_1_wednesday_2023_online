package teacher.lesson_15_refactoring.lessoncode;

public class Aged extends Item {

    public Aged(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        if (quality < 50) {
            quality++;
        }
    }
}
