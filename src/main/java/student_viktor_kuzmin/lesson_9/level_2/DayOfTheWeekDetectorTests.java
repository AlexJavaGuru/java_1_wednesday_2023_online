package student_viktor_kuzmin.lesson_9.level_2;

class DayOfTheWeekDetectorTests {

    public static void main(String[] args) {

    }
    public static void testIfVersion() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        System.out.println("If Version:");
        for (int i = 0; i <= 8; i++) {
            String expected = (i >= 1 && i <= 7) ? getDayName(i) : "Please input a valid number between 1 and 7";
            String result = ifVersion.detectDayName(i);
            System.out.println("Day " + i + ": " + result);
            if (result.equals(expected)) {
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed!");
            }
        }
    }

    public static void testSwitchVersion() {
        DayOfTheWeekDetectorSwitch switchVersion = new DayOfTheWeekDetectorSwitch();
        System.out.println("\nSwitch Version:");
        for (int i = 0; i <= 8; i++) {
            String expected = (i >= 1 && i <= 7) ? getDayName(i) : "Please input a valid number between 1 and 7";
            String result = switchVersion.detectDayName(i);
            System.out.println("Day " + i + ": " + result);
            if (result.equals(expected)) {
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed!");
            }
        }
    }

    public static void testArrayVersion() {
        DayOfTheWeekDetectorArray arrayVersion = new DayOfTheWeekDetectorArray();
        System.out.println("\nArray Version:");
        for (int i = 0; i <= 8; i++) {
            String expected = (i >= 1 && i <= 7) ? getDayName(i) : "Please input a valid number between 1 and 7";
            String result = arrayVersion.detectDayName(i);
            System.out.println("Day " + i + ": " + result);
            if (result.equals(expected)) {
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed!");
            }
        }
    }public static String getDayName(int number) {
        String[] daysOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        return daysOfWeek[number - 1];
    }
}
