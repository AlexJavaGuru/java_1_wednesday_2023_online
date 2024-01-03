package student_dmitrij_petrass.lesson_6.level_2;

import java.util.Scanner;

class DayOfTheWeekDetector {


    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number. Please enter a number between 1 and 7.";
                break;
        }

        return dayName;
    }


}
