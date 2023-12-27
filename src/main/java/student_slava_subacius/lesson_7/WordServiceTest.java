package student_slava_subacius.lesson_7;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest.testFindMostFrequentWord();
    }
    public static void testFindMostFrequentWord() {
        WordService wordService = new WordService();


        String text = "apple banana apple orange banana apple";
        String result = wordService.findMostFrequentWord(text);
        System.out.println("Most frequent word: " + result);
    }
}
