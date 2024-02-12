package student_viktor_kuzmin.homework_lesson_7.level_1;

import java.util.HashMap;
import java.util.Map;

class WordServiceTest {

    private static WordService WordFrequencyCounter;

    public static void main(String[] args) {
        testWordFrequencyCount();
        testWordFrequencyCountEmptyString();
        testMostFrequentWord();
        testMostFrequentWordEmptyString();
    }

    public static void testWordFrequencyCount() {
        String text = "This is a test string with some words. This string contains repeated words, words - this, this, this.";
        Map<String, Integer> expectedFrequency = new HashMap<>();
        expectedFrequency.put("this", 3);
        expectedFrequency.put("is", 1);
        expectedFrequency.put("a", 1);
        expectedFrequency.put("test", 1);
        expectedFrequency.put("string", 2);
        expectedFrequency.put("with", 1);
        expectedFrequency.put("some", 1);
        expectedFrequency.put("words", 3);
        expectedFrequency.put("contains", 1);
        expectedFrequency.put("repeated", 1);

        Map<String, Integer> actualFrequency = WordService.countWordFrequency(text);

        System.out.println("Test Word Frequency Count:");
        if (expectedFrequency.equals(actualFrequency)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
    }

    public static void testWordFrequencyCountEmptyString() {
        String text = "";
        Map<String, Integer> expectedFrequency = new HashMap<>();
        Map<String, Integer> actualFrequency = WordService.countWordFrequency(text);

        System.out.println("Test Word Frequency Count Empty String:");
        if (expectedFrequency.equals(actualFrequency)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
    }

    public static void testMostFrequentWord() {
        String text = "This is a test string with some words. This string contains repeated words, words - this, this, this.";
        String expectedMostFrequentWord = "this";
        String actualMostFrequentWord = WordService.findMostFrequentWord(text);

        System.out.println("Test Most Frequent Word:");
        if (expectedMostFrequentWord.equals(actualMostFrequentWord)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
    }

    public static void testMostFrequentWordEmptyString() {
        String text = "";
        String expectedMostFrequentWord = "";
        String actualMostFrequentWord = WordService.findMostFrequentWord(text);

        System.out.println("Test Most Frequent Word Empty String:");
        if (expectedMostFrequentWord.equals(actualMostFrequentWord)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
    }
}