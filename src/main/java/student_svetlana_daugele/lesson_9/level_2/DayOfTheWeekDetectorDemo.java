package student_svetlana_daugele.lesson_9.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        run(dayOfTheWeekDetectorIfVersion);
        run(dayOfTheWeekDetectorArrayVersion);
        run(dayOfTheWeekDetectorSwitchVersion);
        String d = dayOfTheWeekDetectorIfVersion.detectDayName(5);
        System.out.println (d);
    }
    public static void run(DayOfTheWeekDetector dayOfTheWeekDetector){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert a number between 1 and 7: ");
        int number = scanner.nextInt();
        String a = dayOfTheWeekDetector.detectDayName(number);
        System.out.println (a);
    }
}
