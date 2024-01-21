package student_artur_zaharov.lesson_7.level_6;

public class PalindromeTest {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        System.out.println(testIsPalindrome(palindrome, "racecar") + "<------- test for true" + "  test name: racecar");
               System.out.println(testIsPalindrome(palindrome, "level")+ "<------- test for true" + "  test name: level");
        System.out.println(testIsPalindrome(palindrome, "А роза упала на лапу Азора")+ "<------- test for true" + "  test name: А роза упала на лапу Азора");

        System.out.println(testIsPalindrome(palindrome, "racecar false test") + "<------- test for false" + "  test name: racecar false test");
        System.out.println(testIsPalindrome(palindrome, "HELLO") + "<------- test for false" + "  test name: HELLO");
    }


    private static boolean testIsPalindrome(Palindrome palindrome, String input){
        boolean expected = true;
        boolean actual = palindrome.isPalindrome(input);
        return expected == actual;
    }
}
