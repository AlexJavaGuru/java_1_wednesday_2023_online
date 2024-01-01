package student_artur_zaharov.lesson_6.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();

    }

   // public void findDayOfTheWeek() {



//        switch (dayNumber) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Not correct day number");
//                break;
//        }


        public String findDayOfTheWeek (int dayNumber){
            String [] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sunday", "Saturday"};

            if (dayNumber >= 1 && dayNumber <=7){
                return daysOfWeek [dayNumber - 1];
            } else {
                return "Not correct day number";
            }


        }
    }



