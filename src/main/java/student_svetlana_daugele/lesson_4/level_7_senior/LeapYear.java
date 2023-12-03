package student_svetlana_daugele.lesson_4.level_7_senior;

class LeapYear {
    public boolean isLeapYear(int year) {
       if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
           return true;}
       else {
           return false;
           }
       }
    }