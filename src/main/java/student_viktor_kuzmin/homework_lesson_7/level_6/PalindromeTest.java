package student_viktor_kuzmin.homework_lesson_7.level_6;

class PalindromeTest {
        public static void main(String[] args) {
            testIsPalindromePositive();
            testIsPalindromeNegative();
        }

        private static void testIsPalindromePositive() {
            Palindrome palindrome = new Palindrome();
            if (palindrome.isPalindrome("level")) {
                System.out.println("Test passed: 'level'");
            } else {
                System.out.println("Test failed: 'level'");
            }

            if (palindrome.isPalindrome("А роза упала на лапу Азора")) {
                System.out.println("Test passed: 'А роза упала на лапу Азора'");
            } else {
                System.out.println("Test failed: 'А роза упала на лапу Азора'");
            }

            if (palindrome.isPalindrome("A man, a plan, a canal, Panama")) {
                System.out.println("Test passed: 'A man, a plan, a canal, Panama'");
            } else {
                System.out.println("Test failed: 'A man, a plan, a canal, Panama'");
            }
        }

        private static void testIsPalindromeNegative() {
            Palindrome palindrome = new Palindrome();
            if (!palindrome.isPalindrome("hello")) {
                System.out.println("Test passed: 'hello'");
            } else {
                System.out.println("Test failed: 'hello'");
            }
        }
    }