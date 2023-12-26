package student_svetlana_daugele.lesson_7.level_1;

class WordServiceTest {
    private String myResult;

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.mostFrequentWordTest();
        wordServiceTest.mostFrequentWordTest2();
    }
    private void mostFrequentWordTest() {
        WordService wordService = new WordService();
        String expectedResult = "are";
        String myResult = wordService.mostFrequentWord("Hello, how are you! Are you fine? ");
        System.out.println("Expected result is " + expectedResult);
        System.out.println("My result is " + myResult);
        if (expectedResult.equals(myResult)) {
            System.out.println("Test is ok");
        } else {
            System.out.println("Test is false");
        }
    }
    private void mostFrequentWordTest2() {
        WordService2 wordService2 = new WordService2();
        String expectedResult = "do";
        String myResult = wordService2.mostFrequentWord("Coding is fun. Do you agree? Do you like coding? And do you?");
        System.out.println("Expected result for version 2 is " + expectedResult);
        System.out.println("My result  for version 2 is " + myResult);
        if (expectedResult.equals(myResult)) {
            System.out.println("Test for version 2 is ok");
        } else {
            System.out.println("Test for version 2 is false");
        }
    }
}


