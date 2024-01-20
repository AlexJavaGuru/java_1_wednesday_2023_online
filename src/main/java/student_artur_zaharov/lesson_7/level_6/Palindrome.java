package student_artur_zaharov.lesson_7.level_6;

class Palindrome {
    public boolean isPalindrome (String text) {
        text = text.replaceAll("\\s", "").toLowerCase();

                char[] charArray = text.toCharArray();

        int left =0;
        int right = charArray.length -1;

        while (left < right) {
            if (charArray[left] != charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
