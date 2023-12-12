package student_svetlana_daugele.lesson_4.level_7_senior;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isLeapYearDivedeBy4();
        leapYearTest.isLeapYearDivededBy100();
        leapYearTest.isLeapYearDivededBy400();
        leapYearTest.isLeapYearNotDivededBy4();
    }

    private void isLeapYearNotDivededBy4() {
        LeapYear leapYear = new LeapYear();
        Boolean realResult = leapYear.isLeapYear(2023);
        boolean expectedResult = false;

        if (realResult.equals(expectedResult)) {
            System.out.println("Leap Year Test (not divided by 4) = OK");
        } else {
            System.out.println("Leap Year Test (not divided by 4) = FAIL");
        }
    }

    private void isLeapYearDivedeBy4 () {
            LeapYear leapYear = new LeapYear();
            Boolean realResult = leapYear.isLeapYear(1600);
            boolean expectedResult = true;

            if (realResult.equals(expectedResult)) {
                System.out.println("Leap Year Test (divided by 400) = OK");
            } else {
                System.out.println("Leap Year Test (divided by 400) = FAIL");
            }
        }

        private void isLeapYearDivededBy400 () {
            LeapYear leapYear = new LeapYear();
            Boolean realResult = leapYear.isLeapYear(1600);
            boolean expectedResult = true;

            if (realResult.equals(expectedResult)) {
                System.out.println("Leap Year Test (divided by 400) = OK");
            } else {
                System.out.println("Leap Year Test (divided by 400) = FAIL");
            }
        }

        private void isLeapYearDivededBy100 () {
            LeapYear leapYear = new LeapYear();
            Boolean realResult = leapYear.isLeapYear(1700);
            boolean expectedResult = false;

            if (realResult.equals(expectedResult)) {
                System.out.println("Leap Year Test (divided by 100) = OK");
            } else {
                System.out.println("Leap Year Test (divided by 100) = FAIL");
            }
        }

        private void isLeapYear () {
            LeapYear leapYear = new LeapYear();
            Boolean realResult = leapYear.isLeapYear(2024);
            boolean expectedResult = true;

            if (realResult.equals(expectedResult)) {
                System.out.println("Leap Year Test = OK");
            } else {
                System.out.println("eap Year Test = FAIL");
            }
        }

    }
