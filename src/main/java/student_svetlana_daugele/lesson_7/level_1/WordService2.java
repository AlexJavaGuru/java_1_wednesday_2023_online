package student_svetlana_daugele.lesson_7.level_1;

class WordService2 {
    public String mostFrequentWord(String text) {
        String[] words = processText(text);
        String mostFrequentWord = findMostFrequentWord(words);
        System.out.println("Most frequent word: " + mostFrequentWord);
        return mostFrequentWord;
    }

    public static String[] processText(String text) {
        String cleanText = text.replaceAll("[^a-zA-Zа-яА-Я\\s]", "").toLowerCase();
        return cleanText.split("\\s+");
    }

    public static String findMostFrequentWord(String[] words) {
        int maxFrequency = 0;
        String mostFrequentWord = "";

        for (int i = 0; i < words.length; i++) {
            int frequency = 1;

            if (words[i] == null) {
                continue;
            }

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    frequency++;
                    words[j] = null;
                }
            }

            if (frequency > maxFrequency || (frequency == maxFrequency && firstIndexOf(words[i], words) < firstIndexOf(mostFrequentWord, words))) {
                maxFrequency = frequency;
                mostFrequentWord = words[i];
            }
        }

        return mostFrequentWord;
    }

    public static int firstIndexOf(String word, String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (word.equals(words[i])) {
                return i;
            }
        }
        return -1;
    }
}
