package student_viktor_kuzmin.lesson_9.level_2;

public class DayOfTheWeekDetectorArray implements DayOfTheWeekDetector{

    private static final String[] daysOfWeek = {
            "Please input a valid number between 1 and 7",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
    };

    public String detectDayName(int number) {
        if (number >= 1 && number <= 7) {
            return daysOfWeek[number];
        } else {
            return daysOfWeek[0];
        }
    }
}
