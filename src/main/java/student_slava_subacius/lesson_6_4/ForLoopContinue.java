package student_slava_subacius.lesson_6_4;

import teacher.lesson_5_arrays_for_loop.lessoncode.ArrayUtil;

public class ForLoopContinue {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(10);
        int i = 0;
        for(i = 0; i <= 5; i ++) {
            if (i == 3) {
                System.out.println("Pass i=3 ");
                continue;
            }
            System.out.println("Value i= " + i);


        }

    }
}
