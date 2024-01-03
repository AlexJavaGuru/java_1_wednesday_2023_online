package student_dmitrij_petrass.lesson_6.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Unknown operation");
        }
        System.out.println();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        System.out.println(dayOfTheWeek);
    }
}

