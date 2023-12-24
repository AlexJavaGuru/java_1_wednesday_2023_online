package student_slava_subacius.lesson_7;

public class WordServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String text = "the cat and the dog";
        String mostFrequentWord = wordService.findMostFrequentWord(text);
        System.out.println("Наиболее часто встречающееся слово: " + mostFrequentWord);
    }
}

