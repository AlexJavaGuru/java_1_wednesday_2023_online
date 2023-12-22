package student_slava_subacius.lesson_6_4;

import teacher.lesson_5_arrays_for_loop.lessoncode.ArrayUtil;

public class WhileLoopContinue {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(10);
        int i = 1;
        while (i <= 10) {
            System.out.println("Value i = " + i);
            if (i == 5) {
                System.out.println("Early completion of the cycle.");
                break;
            }
            i++;
        }

    }
}