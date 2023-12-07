package student_artur_zaharov.lesson_4.level5;
//380 ... 449 - Фиолетовый ("Violet")
//450 ... 494 - Синий ("Blue")
//495 ... 569 - Зеленый ("Green")
//570 ... 589 - Желтый ("Yellow")
//590 ... 619 - Оранжевый ("Orange")
//620 ... 750 - Красный ("Red")
//Вне диапазонов - невидимый спектр ("Invisible Light")
class LightColorDetector1 {

    public String detect(int waveLength) {
        String color;
        if (380 <= waveLength && waveLength < 450) {
            color = "Violet";

        } else if (450 <= waveLength && waveLength < 495) {
            color = "Blue";

        } else if (495 <= waveLength && waveLength < 570) {
            color = "Green";

        } else if (570 <= waveLength && waveLength < 590) {
            color = "Yellow";

        } else if (590 <= waveLength && waveLength < 620) {
            color = "Orange";

        } else if (620 <= waveLength && waveLength < 751) {
            color = "Yellow";

        } else {
            color = "Invisible Light";
        }
        return color;


    }
}
