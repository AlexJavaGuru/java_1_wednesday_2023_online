package student_svetlana_daugele.lesson_9.level_2;

class DayOfTheWeekDetectorTest {



    public static void main(String[] args) {

        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.checkArrayVersion(1, "Monday");
        dayOfTheWeekDetectorTest.checkArrayVersion(7, "Sunday");
        dayOfTheWeekDetectorTest.checkArrayVersionForNumberOutsideTheRange(8);
        dayOfTheWeekDetectorTest.checkIfVersion(2, "Tuesday");
        dayOfTheWeekDetectorTest.checkIfVersion(3, "Wednesday");
        dayOfTheWeekDetectorTest.checkIfVersionForNumberOutsideTheRange(0);
        dayOfTheWeekDetectorTest.checkSwitchVersion(4, "Thursday");
        dayOfTheWeekDetectorTest.checkSwitchVersion(5, "Friday");
        dayOfTheWeekDetectorTest.checkSwitchVersionForNumberOutsideTheRange(-5);
    }

    private void checkSwitchVersionForNumberOutsideTheRange(int number) {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion =  new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(number);
        String expectedResult = "Please input a valid number between 1 and 7";
        checkOutsideRangeTestResult1(result, expectedResult);

    }

    void checkSwitchVersion(int number, String expectedWeekDayName) {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String weekDayName = dayOfTheWeekDetectorSwitchVersion.detectDayName(number);
        checkTestResult(weekDayName, expectedWeekDayName);
    }

    void checkIfVersion ( int number, String expectedWeekDayName){
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String weekDayName = dayOfTheWeekDetectorIfVersion.detectDayName(number);
        checkTestResult(weekDayName, expectedWeekDayName);
    }
    void checkArrayVersion ( int number, String expectedWeekDayName){
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String weekDayName = dayOfTheWeekDetectorArrayVersion.detectDayName(number);
        checkTestResult(weekDayName, expectedWeekDayName);
    }
    void checkIfVersionForNumberOutsideTheRange ( int number){
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result;
        result = dayOfTheWeekDetectorIfVersion.detectDayName(number);
        String expectedResult = "Please input a valid number between 1 and 7";
        checkOutsideRangeTestResult1(result, expectedResult);
    }
    void checkArrayVersionForNumberOutsideTheRange ( int number){
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String result;
        result = dayOfTheWeekDetectorArrayVersion.detectDayName(number);
        String expectedResult = "Please input a valid number between 1 and 7";
        checkOutsideRangeTestResult1(result, expectedResult);
    }
    private void checkTestResult (String weekDayName, String expectedWeekDayName){
        if (expectedWeekDayName.equals(weekDayName)) {
                System.out.println(expectedWeekDayName + " test is passed (OK)");
        } else {
                System.out.println(" Test is FAILED ");
        }
    }
    private void checkOutsideRangeTestResult1 (String result, String expectedResult){
        if (expectedResult.equals(result)) {
            System.out.println("Outside Range Test is passed (OK)");
        } else {
            System.out.println("Outside Range Test is FAILED ");
        }
    }
}

