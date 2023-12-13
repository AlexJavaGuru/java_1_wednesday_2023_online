package student_dmitrijs_voronins.lesson_4.level_5;

class LightColorDetector {
    public String detect(int waveLength) {
        String color;

        if (380 <= waveLength && waveLength <= 449) {
            color = "Violet";
        } else if (450 <= waveLength && waveLength <= 494) {
            color = "Blue";
        } else if (495 <= waveLength && waveLength <= 569) {
            color = "Green";
        } else if (570 <= waveLength && waveLength <= 589) {
            color = "Yellow";
        } else if (590 <= waveLength && waveLength <= 619) {
            color = "Orange";
        } else if (620 <= waveLength && waveLength <= 750) {
            color = "Red";
        } else {
            color = "Invisible Ligh";
        }
        return color;

    }

}
//380 ... 449 - Фиолетовый ("Violet")
//450 ... 494 - Синий ("Blue")
//495 ... 569 - Зеленый ("Green")
//570 ... 589 - Желтый ("Yellow")
//590 ... 619 - Оранжевый ("Orange")
//620 ... 750 - Красный ("Red")