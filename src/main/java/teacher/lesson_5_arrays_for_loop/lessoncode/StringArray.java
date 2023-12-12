package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Arrays;

public class StringArray {

    public static void main(String[] args) {

        String[] words = new String[4];

        words[0] = "Hello";
        words[1] = "My";
        words[2] = "Name";
        words[3] = "is Alex";

        System.out.println(Arrays.toString(words));
    }
}
