package student_svetlana_daugele.lesson_7.level_6;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest =  new PalindromeTest();
        palindromeTest.palindromeTest("А роза упала на лапу Азора");
        palindromeTest.palindromeTest("");
        palindromeTest.palindromeTest("racecar");
        palindromeTest.palindromeTest("level");
        palindromeTest.palindromeTest("sum summus mus");
        palindromeTest.palindromeTest("Hello World");
        palindromeTest.palindromeTest("12321");

    }
    public void palindromeTest(String text){
        Palindrome palindrome =  new Palindrome();
        boolean result = palindrome.isPalindrome("А роза упала на лапу Азора");
        boolean expectedResult = true;
        printTestResult(expectedResult, result);
    }
    public void printTestResult (boolean expectedResult, boolean result) {
        if (expectedResult == result) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FALSE");
        }
    }
}
