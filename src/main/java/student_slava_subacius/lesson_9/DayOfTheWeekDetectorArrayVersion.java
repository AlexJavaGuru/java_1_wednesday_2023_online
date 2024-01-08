package student_slava_subacius.lesson_9;



public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    private static final String[] daysOfWeek = {
            "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    public String detectDayName(int number) {
        if (number >= 1 && number <= 7) {
            return daysOfWeek[number];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}

