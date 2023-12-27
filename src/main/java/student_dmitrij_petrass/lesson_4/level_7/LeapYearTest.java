package student_dmitrij_petrass.lesson_4.level_7;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.leapYearDivOn4();
        leapYearTest.leapYearDivOn100();
        leapYearTest.leapYearDivOn400();

    }

    public void leapYearDivOn4() {
        LeapYear leapYear = new LeapYear();
        Boolean realResult = leapYear.isLeapYear(2021);
        boolean expectedResult = false;

        if (realResult.equals(expectedResult)) {
            System.out.println("Leap Year test / 4 = has passed!");
        } else {
            System.out.println("Leap Year test / 4 = FAIL! ");
        }
    }

    public void leapYearDivOn100() {
        LeapYear leapYear = new LeapYear();
        Boolean realResult = leapYear.isLeapYear(2000);
        boolean expectedResult = true;

        if (realResult.equals(expectedResult)) {
            System.out.println("Leap Year test / 100 = has passed!");
        } else {
            System.out.println("Leap Year test / 100 = FAIL! ");
        }
    }

    public void leapYearDivOn400() {
        LeapYear leapYear = new LeapYear();
        Boolean realResult = leapYear.isLeapYear(1800);
        boolean expectedResult = true;

        if (realResult.equals(expectedResult)) {
            System.out.println("Leap Year test / 400 = has passed!");
        } else {
            System.out.println("Leap Year test / 400 = FAIL! ");
        }
    }
}

