package student_slava_subacius.lesson_6_1;


public class NumberUtilsTest {

    public static void main(String[] args) {
        testIsEvenWithEvenNumber();
    }
    public static void testIsEvenWithEvenNumber() {
            NumberUtils numberUtils = new NumberUtils();
            int number = 4;
            boolean result = numberUtils.isEven(number);
            System.out.println("Testing with : " + number + " " + result);

    }
}