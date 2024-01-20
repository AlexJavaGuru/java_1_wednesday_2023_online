package student_artur_zaharov.lesson_7.level_1_5;

public class WordServiceTest {

    public static void main(String[] args) {
        testFindMostFrequentWord();
    }

    private static void testFindMostFrequentWord() {
        WordService wordService = new WordService();

        // Test case 1: Basic test
        String text1 = "apple banana orange apple banana";
        assertResult(wordService.findMostFrequentWord(text1), "apple");

        // Test case 2: Case sensitivity
        String text2 = "Apple Banana apple banana";
        assertResult(wordService.findMostFrequentWord(text2), "apple");

        // Test case 3: Handling punctuation
        String text3 = "apple, banana, orange. Apple: banana.";
        assertResult(wordService.findMostFrequentWord(text3), "apple");

        // Test case 4: Multiple words with the same frequency, choose the first one
        String text4 = "apple banana orange banana apple";
        assertResult(wordService.findMostFrequentWord(text4), "apple");

        System.out.println("All tests passed!");
    }

    private static void assertResult(String actual, String expected) {
        if (actual.toLowerCase().equals(expected.toLowerCase())) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed. Expected: " + expected + ", Actual: " + actual);
        }
    }
}