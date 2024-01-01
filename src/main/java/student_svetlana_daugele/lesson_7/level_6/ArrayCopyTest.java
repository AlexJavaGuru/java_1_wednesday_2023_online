package student_svetlana_daugele.lesson_7.level_6;
import java.util.Arrays;
public class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.copyInRangeTest();
    }

    public void copyInRangeTest() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] in = {1, 2, 3, 8, 10, 15, 25, 33, 50, 57, 58};
        System.out.println( "Initial array: " + Arrays.toString(in));
        int numberFrom = 3;
        int numberTo = 50;
        int expectedLength = 7;
        int result = arrayCopy.arrayLength(in, numberFrom, numberTo);
        int[] copiedArray = arrayCopy.copyInRange(in, numberFrom, numberTo);
        System.out.println("Modified array: " + Arrays.toString(copiedArray));
        if (expectedLength == result) {
            System.out.println("Test result is OK.");
        } else {
            System.out.println("Test result is FALSE.");

        }
    }
}