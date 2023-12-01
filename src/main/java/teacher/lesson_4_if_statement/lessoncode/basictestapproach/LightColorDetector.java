package teacher.lesson_4_if_statement.lessoncode.basictestapproach;

//380 ... 449 - Фиолетовый ("Violet")
//450 ... 494 - Синий ("Blue")
//495 ... 569 - Зеленый ("Green")
//570 ... 589 - Желтый ("Yellow")
//590 ... 619 - Оранжевый ("Orange")
//620 ... 750 - Красный ("Red")
//Вне диапазонов - невидимый спектр ("Invisible Light")
public class LightColorDetector {

    public String detect(int waveLength) {
        String color;
        if (380 <= waveLength && waveLength <= 449) {
            color = "Violet";
        } else if (449 < waveLength && waveLength <= 494) {
            color = "Blue";
        } else {
            color = "Invisible Light";
        }
        return color;
    }
}
