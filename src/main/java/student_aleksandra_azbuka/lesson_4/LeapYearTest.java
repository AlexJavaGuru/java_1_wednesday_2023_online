package student_aleksandra_azbuka.lesson_4;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.testLeapYear();
        test.testNotLeapYear();
    }

    public void testLeapYear() {
        int year = 2012;
        Boolean expectedResult = Boolean.TRUE;
        LeapYear leapYear = new LeapYear();
        Boolean realResult = leapYear.isLeapYear(year);

        if (realResult.equals(expectedResult)) {
            System.out.println("Test LeapYear passed");
        } else {
            System.out.println("Test LeapYear failed");
        }
    }

    public void testNotLeapYear() {
        int year = 2023;
        Boolean expectedResult = Boolean.FALSE;
        LeapYear leapYear = new LeapYear();
        Boolean realResult = leapYear.isLeapYear(year);

        if (realResult.equals(expectedResult)) {
            System.out.println("Test NotLeapYear passed");
        } else {
            System.out.println("Test NotLeapYear failed");
        }
    }
}
