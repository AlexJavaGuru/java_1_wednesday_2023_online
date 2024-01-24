package student_viktor_kuzmin.homework_lesson_4.level_5;

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
            color = "Invisible light";
        }
        return color;
    }

}
