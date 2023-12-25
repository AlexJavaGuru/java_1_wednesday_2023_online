package student_slava_subacius.lesson_7;

class WordService {


    public String findMostFrequentWord(String text) {
        if (text.isEmpty()) {
            return "";
        }

        String[] words = text.split("\\s+");
        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                continue;
            }
            String currentWord = words[i].toLowerCase();
            int frequency = 1;

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentWord = currentWord;
            }
        }

        return mostFrequentWord;
    }


}
