package student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5;

import java.util.Set;

class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest uniqueWordFinderTest = new UniqueWordFinderTest();
        uniqueWordFinderTest.testUniqueWordFinder("I am very, very happy!");
    }

    public static void testUniqueWordFinder(String text) {
        Set<String> uniqueWords = UniqueWordFinder.find(text);
        System.out.println("Unique words: " + uniqueWords);
    }

}

