package student_artur_zaharov.lesson_6.level_2;

public class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfWeek);



    }

}
