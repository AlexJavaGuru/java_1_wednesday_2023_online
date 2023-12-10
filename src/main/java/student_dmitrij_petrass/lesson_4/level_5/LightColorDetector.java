package student_dmitrij_petrass.lesson_4.level_5;


class LightColorDetector {

    public String detect(int waveLength) {
        String color;
        if (380 <= waveLength && waveLength <= 449) {
            color = "Violet";
        } else if (449 < waveLength && waveLength <= 494) {
            color = "Blue";
        } else if (494 < waveLength && waveLength <= 569) {
            color = "Green";
        } else if (569 < waveLength && waveLength <= 589) {
            color = "Yellow";
        } else if (589 < waveLength && waveLength <= 619) {
            color = "Orange";
        } else if (619 < waveLength && waveLength <= 750) {
            color = "Red";
        } else {
           color = "Invisible Light";
        }
        return color;
    }
}
