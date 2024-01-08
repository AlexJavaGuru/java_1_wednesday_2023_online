package student_slava_subacius.lesson_9;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector detector;
    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }
    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo ifVersionDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        ifVersionDemo.run();
        DayOfTheWeekDetectorDemo switchVersionDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        switchVersionDemo.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int inputNumber = scanner.nextInt();
        String dayName = detector.detectDayName(inputNumber);
        System.out.println("The day of the week is: " + dayName);


    }
}