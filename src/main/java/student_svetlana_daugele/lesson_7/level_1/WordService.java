package student_svetlana_daugele.lesson_7.level_1;
import java.util.*;
class WordService {


    public String mostFrequentWord(String text){
        String[] words = processText(text);
        findMostFrequentWord(words);
        String mostFrequentWord = findMostFrequentWord(words);
        System.out.println("Most frequent word: " + mostFrequentWord);
        return mostFrequentWord;
    }
    public static String[] processText(String text) {
        String cleanText = text.replaceAll("[^a-zA-Zа-яА-Я\\s]", "").toLowerCase();
        return cleanText.split("\\s+");
    }

    public static String findMostFrequentWord(String[] words) {
        Map<String, Integer> wordFrequency = new LinkedHashMap<>();

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        int maxFrequency = 0;
        String mostFrequentWord = "";

        for (String word : wordFrequency.keySet()) {
            int frequency = wordFrequency.get(word);
            if (frequency > maxFrequency || (frequency == maxFrequency && firstIndexOf(word, words) < firstIndexOf(mostFrequentWord, words))) {
                maxFrequency = frequency;
                mostFrequentWord = word;
            }
        }

        return mostFrequentWord;
    }

    public static int firstIndexOf(String word, String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
}