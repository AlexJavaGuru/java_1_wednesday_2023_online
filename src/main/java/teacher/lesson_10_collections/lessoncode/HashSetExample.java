package teacher.lesson_10_collections.lessoncode;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        for (String string : strings) {
            System.out.println(string);
        }

    }
}
