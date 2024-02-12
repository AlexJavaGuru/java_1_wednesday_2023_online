package student_viktor_kuzmin.homework_lesson_7.level_1;

import java.util.HashMap;
import java.util.Map;

class WordService {

    public static void main(String[] args) {
        String text = "This is a test string with some words. This string contains repeated words, words - this, this, this.";
        String mostFrequentWord = findMostFrequentWord(text);
        System.out.println("Most frequented word: " + mostFrequentWord);
    }

    public static String findMostFrequentWord(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> wordFrequency = countWordFrequency(text);

        String mostFrequentWord = "";
        int maxFrequency = 0;
        for (String word : words) {
            word = word.toLowerCase();
            int frequency = wordFrequency.get(word);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentWord = word;
            }
        }

        return mostFrequentWord;
    }

    public static Map<String, Integer> countWordFrequency(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        return wordFrequency;
    }
}