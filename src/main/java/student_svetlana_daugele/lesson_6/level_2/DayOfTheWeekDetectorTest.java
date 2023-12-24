package student_svetlana_daugele.lesson_6.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.test("Monday",1);
        dayOfTheWeekDetectorTest.test("Tuesday",2);
        dayOfTheWeekDetectorTest.test("Wednesday", 3);
        dayOfTheWeekDetectorTest.test("Thursday", 4);
        dayOfTheWeekDetectorTest.test("Friday",5);
        dayOfTheWeekDetectorTest.test("Saturday", 6);
        dayOfTheWeekDetectorTest.test("Sunday", 7);
        dayOfTheWeekDetectorTest.test("Not correct day number", 8);
    }

    public void test (String dayName, int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        if (dayName.equals(result)) {
            System.out.println(dayName + " test = OK");
        } else {
            System.out.println(dayName + " test = FAIL");
        }
    }

}


