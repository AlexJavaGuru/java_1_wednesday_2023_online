package student_svetlana_daugele.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

class ListExample2 {
    public static void main(String[] args) {


        List<Object> myList = new ArrayList<>();


        int primitive1 = 99;
        myList.add(primitive1);

        String string1 = "Hello, Alex!";
        myList.add(string1);

        double double1 = 3.14;
        double double2 = 2.71;
        myList.add(double1);
        myList.add(double2);


        System.out.println("List contains:");

        for (Object item : myList) {
            System.out.println(item);
        }
    }
}
