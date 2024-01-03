package student_dmitrij_petrass.lesson_6.level_2;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        testShouldReturnMonday();
        testShouldReturnTuesday();
        testShouldReturnWednesday();
        testShouldReturnThursday();
        testShouldReturnFriday();
        testShouldReturnSaturday();
        testShouldReturnSunday();
        testShouldReturnUnrealDay();
    }

    public static void testShouldReturnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }

    public static void testShouldReturnTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }

    public static void testShouldReturnWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }

    public static void testShouldReturnThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }

    public static void testShouldReturnFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }

    public static void testShouldReturnSaturday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }

    public static void testShouldReturnSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }

    public static void testShouldReturnUnrealDay() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(8);
        checkTestResult("Invalid day number. Please enter a number between 1 and 7.".equals(dayOfTheWeek), "Invalid day number. Please enter a number between 1 and 7.");
    }

    private static void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
