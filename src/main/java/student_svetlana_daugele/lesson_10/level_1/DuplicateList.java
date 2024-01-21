package student_svetlana_daugele.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

class DuplicateList {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(3);
        integerList.add(5);
        integerList.add(3);
        integerList.add(1);
        integerList.add(7);


        System.out.println("My integer list:");
        for (Integer number : integerList) {
            System.out.println(number);
        }
    }
}
