package student_slava_subacius.lesson_9;



public class DayOfTheWeekDetectorArrayVersionTest {
    public static void main(String[] args) {
        testImplementation(new DayOfTheWeekDetectorIfVersion());
        testImplementation(new DayOfTheWeekDetectorSwitchVersion());
        testImplementation(new DayOfTheWeekDetectorArrayVersion());

    }
    private static void testImplementation(DayOfTheWeekDetector detector) {
        for (int i = 0; i <= 7; i++) {
            System.out.println(detector.detectDayName(i));
        }
    }
}

