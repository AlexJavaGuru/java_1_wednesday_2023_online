package student_slava_subacius.lesson_7;

public class WordServiceDemo {

        public static void main(String[] args) {
            WordService wordService = new WordService();
            String text = "Your input text goes here";
            wordService.findMostFrequentWord(text);
            String mostFrequentWord = wordService.findMostFrequentWord(text);
            System.out.println("Most frequent word: " + mostFrequentWord);
        }
}


