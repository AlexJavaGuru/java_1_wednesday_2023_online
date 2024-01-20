package student_artur_zaharov.lesson_7.level_1_5;

import java.util.HashMap;
import java.util.Map;

public class WordService {

    public String findMostFrequentWord(String text) {
        // Step 1: Split text into words
        String[] words = text.split("\\s+");

        // Step 2: Count occurrences of each word
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters
            wordCount.put(word.toLowerCase(), wordCount.getOrDefault(word.toLowerCase(), 0) + 1);
        }

        // Step 3: Find the most frequent word
        String mostFrequentWord = "";
        int maxOccurrences = 0;

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters
            int occurrences = wordCount.get(word.toLowerCase());
            if (occurrences > maxOccurrences || (occurrences == maxOccurrences && word.indexOf(mostFrequentWord) == 0)) {
                mostFrequentWord = word;
                maxOccurrences = occurrences;
            }
        }

        return mostFrequentWord;
    }
}