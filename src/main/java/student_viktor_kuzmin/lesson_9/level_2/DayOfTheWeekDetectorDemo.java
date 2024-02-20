package student_viktor_kuzmin.lesson_9.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    private final DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 till 7: ");
        int number = scanner.nextInt();

        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorArray();
        String dayName = detector.detectDayName(number);

        System.out.println("Day name is " + dayName);
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo demo1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        DayOfTheWeekDetectorDemo demo2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitch());
        DayOfTheWeekDetectorDemo demo3 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArray());

        System.out.println("If version:");
        demo1.run();

        System.out.println("\nSwitch version:");
        demo2.run();

        System.out.println("\nArray version:");
        demo3.run();
    }
}


