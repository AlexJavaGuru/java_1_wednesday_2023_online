package student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {
    public static Set<String> find(String text) {
        Set<String> uniqueWords = new HashSet<>();

        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for (String word : words) {
            uniqueWords.add(word);
        }

        return uniqueWords;
    }
}
