package student_aleksandrs_jeleckis.lesson_6.level_2;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.defaultTest();
        test.mondayTest();
        test.tuesdayTest();
        test.wednesdayTest();
        test.thursdayTest();
        test.fridayTest();
        test.saturdayTest();
        test.sundayTest();
    }

    void mondayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

        String expectedResult = "Monday";
        String actualResult = detector.findDayOfTheWeek(1);

        if (actualResult == expectedResult) {
            System.out.println("Test Monday passed");
        } else {
            System.out.println("Test failed");
        }
    }

    void tuesdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

        String expectedResult = "Tuesday";
        String actualResult = detector.findDayOfTheWeek(2);

        if (actualResult == expectedResult) {
            System.out.println("Test Tuesday passed");
        } else {
            System.out.println("Test failed");
        }
    }

    void wednesdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

        String expectedResult = "Wednesday";
        String actualResult = detector.findDayOfTheWeek(3);

        if (actualResult == expectedResult) {
            System.out.println("Test Wednesday passed");
        } else {
            System.out.println("Test failed");
        }
    }

    void thursdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

        String expectedResult = "Thursday";
        String actualResult = detector.findDayOfTheWeek(4);

        if (actualResult == expectedResult) {
            System.out.println("Test Thursday passed");
        } else {
            System.out.println("Test failed");
        }
    }

    void fridayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

        String expectedResult = "Friday";
        String actualResult = detector.findDayOfTheWeek(5);

        if (actualResult == expectedResult) {
            System.out.println("Test Friday passed");
        } else {
            System.out.println("Test failed");
        }
    }

    void saturdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

        String expectedResult = "Saturday";
        String actualResult = detector.findDayOfTheWeek(6);

        if (actualResult == expectedResult) {
            System.out.println("Test Saturday passed");
        } else {
            System.out.println("Test failed");
        }
    }

    void sundayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

        String expectedResult = "Sunday";
        String actualResult = detector.findDayOfTheWeek(7);

        if (actualResult == expectedResult) {
            System.out.println("Test Sunday passed");
        } else {
            System.out.println("Test failed");
        }
    }

    void defaultTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

        String expectedResult = "Not correct day number";
        String actualResult = detector.findDayOfTheWeek(10);

        if (actualResult == expectedResult) {
            System.out.println("Test Default passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
