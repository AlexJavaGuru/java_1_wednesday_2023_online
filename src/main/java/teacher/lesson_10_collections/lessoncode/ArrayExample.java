package teacher.lesson_10_collections.lessoncode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayExample {

    public static void main(String[] args) {
//        String[] words = new String[10];
//        words[0] = "Hello";

        List<String> words = new LinkedList<>();
        List<Student> students = new ArrayList<>();

        words.add("Hello");
        words.add("My");
        words.add("Name");
        words.add("Is");
        words.add("Alex");

        System.out.println(words.size());

        for (String word : words) {
            System.out.println(word);
        }

        words.remove(1);

        for (String word : words) {
            System.out.println(word);
        }

        words.add("My");

        for (int i = 0; i < words.size(); i++) {
            System.out.println("Word: "+ words.get(i) + " index: " + words.indexOf(words.get(i)));

        }
    }
}
