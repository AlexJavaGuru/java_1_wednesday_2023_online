package student_slava_subacius.lesson_7;

public class WordService {
    public String findMostFrequentWord(String text) {
        String[] words = text.split("\\s+");
        String mostFrequentWord = null;
        int maxCount = 0;
        for (String word : words) {
            int count = 0;
            for (String w : words) {
                if (w.equals(word)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }
}
