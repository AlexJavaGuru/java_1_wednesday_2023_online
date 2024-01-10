package teacher.lesson_10_collections.lessoncode;

import java.util.HashMap;
import java.util.Map;

public class MapInternalWork {
    /*
    1011100101000010000100
    0000000000000000001111 &
    0000000000000000000100
     */

    public static void main(String[] args) {

        Map<Student, String> grades = new HashMap<>();

        Student alex = new Student(1001, 2, "Alex");
        Student alex2 = new Student(1001, 2, "Alex");
        Student viktor = new Student(1002, 1, "Viktor");
        Student svetlana = new Student(1003, 4, "Svetlana");

        grades.put(alex, "Good");
        grades.put(viktor, "Bad");
        grades.put(svetlana, "Excellent");

        Student svetlana2 = new Student(1003, 4, "Svetlana");
        String grade = grades.get(svetlana2);
        System.out.println(grade);
//
//        System.out.println(alex.hashCode());
//        System.out.println(alex2.hashCode());
//        System.out.println(viktor.hashCode());
//        System.out.println(svetlana.hashCode());
//
//        Integer integer = 101;
//        System.out.println(integer.hashCode());
    }
}
