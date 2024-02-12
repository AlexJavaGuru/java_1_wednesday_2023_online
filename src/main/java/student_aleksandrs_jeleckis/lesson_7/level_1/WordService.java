package student_aleksandrs_jeleckis.lesson_7.level_1;

import java.util.HashMap;
import java.util.Map;

public class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> wordCountMap = countOccurrences(words);
        return findMostFrequentWordFromMap(wordCountMap, text);
    }

    private Map<String, Integer> countOccurrences(String[] words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            wordCountMap.put(lowerCaseWord, wordCountMap.getOrDefault(lowerCaseWord, 0) + 1);
        }

        return wordCountMap;
    }

    private String findMostFrequentWordFromMap(Map<String, Integer> countMap, String text) {
        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount || (entry.getValue() == maxCount && text.indexOf(entry.getKey()) < text.indexOf(mostFrequentWord))) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequentWord;
    }

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String text = "java is great and java is powerful. java is the best programming language.";
        String mostFrequentWord = wordService.findMostFrequentWord(text);
        System.out.println("Most frequent word: " + mostFrequentWord);
    }
}

