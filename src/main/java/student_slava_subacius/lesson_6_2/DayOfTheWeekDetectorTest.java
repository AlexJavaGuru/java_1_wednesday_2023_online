package student_slava_subacius.lesson_6_2;



public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnWednesday();
        test.shouldReturnSunday();
        test.shouldReturnInvalidDay();
    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }

    public void shouldReturnWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }

    public void shouldReturnSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }

        public void shouldReturnInvalidDay () {
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            String dayOfTheWeek = detector.findDayOfTheWeek(8);
            checkTestResult("Not correct day number".equals(dayOfTheWeek), "Invalid Day");
        }

        private void checkTestResult ( boolean condition, String testName){
            if (condition) {
                System.out.println(testName + " = OK!");
            } else {
                System.out.println(testName + " = FAIL!");
            }
        }
    }
