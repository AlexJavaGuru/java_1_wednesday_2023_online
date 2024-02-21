package teacher.lesson_15_refactoring.lessoncode;

public class Backstage extends Item {

    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    
    @Override
    public void update() {
        if (sellIn < 0) {
            quality = 0;
        } else if (quality < 50) {
            quality++;
            if (sellIn < 11 && quality < 50) {
                quality++;
            }
            if (sellIn < 6 && quality < 50) {
                quality++;
            }
        }
    }
}
