package student_viktor_kuzmin.homework_lesson_7.level_6;

class Palindrome {
    public boolean isPalindrome(String text) {
        text = text.toLowerCase();

        text = text.replaceAll("[^a-zz-я]", "");
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}


