package student_svetlana_daugele.lesson_7.level_7;

public class WordService {
    public String mostFrequentWord(String text) {
        String[] textArray = splitTextIntoArray(text);
        int[] wordCountArray = countWordOccurrences(textArray);
        int maxIndex = findMaxCountIndex(wordCountArray);
        return textArray[maxIndex];
    }

    private String[] splitTextIntoArray(String text) {
        return text.split(" ");
    }

    private int[] countWordOccurrences(String[] textArray) {
        int[] wordCountArray = new int[textArray.length];

        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            int wordCounter = 1;

            for (int i = wordCount + 1; i < textArray.length; i++) {
                if (textArray[wordCount].equals(textArray[i])) {
                    wordCounter++;
                }
            }

            wordCountArray[wordCount] = wordCounter;
        }

        return wordCountArray;
    }

    private int findMaxCountIndex(int[] wordCountArray) {
        int maxIndex = 0;

        for (int count = 1; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > wordCountArray[maxIndex]) {
                maxIndex = count;
            }
        }

        return maxIndex;
    }
}

