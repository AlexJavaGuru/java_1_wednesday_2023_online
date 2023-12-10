package student_dmitrij_petrass.lesson_4.level_5;


class LightColorDetectorDemo {
    public static void main(String[] args) {
        LightColorDetector colorDetector = new LightColorDetector();

        int waveLenght = 500;

        String color = colorDetector.detect(waveLenght);
        System.out.println("Color = " + color);


    }
}
