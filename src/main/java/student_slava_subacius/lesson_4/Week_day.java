package student_slava_subacius.lesson_4;


import java.util.Scanner;

public class Week_day {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of 1 to 7 : ");

        int dayNumber;

        if (scanner.hasNextInt()) {
            dayNumber = scanner.nextInt();
            String dayOfWeek ;

            switch (dayNumber) {
                case 1:
                    dayOfWeek = "Monday";
                    break;
                case 2:
                    dayOfWeek = "Tuesday";
                    break;
                case 3:
                    dayOfWeek = "Wednesday";
                    break;
                case 4:
                    dayOfWeek = "Thursday";
                    break;
                case 5:
                    dayOfWeek = "Friday";
                    break;
                case 6:
                    dayOfWeek = "Saturday";
                    break;
                case 7:
                    dayOfWeek = "Sunday";
                    break;
                default:
                    dayOfWeek = "Invalid day";
                    break;
            }

            if (dayNumber >= 1 && dayNumber <= 7)
                System.out.println("The entered day number : " + dayOfWeek + ".");
            else {
                System.out.println("Error: Enter a number from 1 to 7.");
            }
        }

    }

}






