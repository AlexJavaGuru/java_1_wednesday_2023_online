package teacher.lesson_5_arrays_for_loop.lessoncode;

public class ForLoopExample {

    public static void main(String[] args) {
        int[] myArray = new int[5];

        myArray[0] = 5;
        myArray[1] = 10;
        myArray[2] = 15;
        myArray[3] = 20;
        myArray[4] = 25;

        for (int i = 0; i < myArray.length; i++) {
//            System.out.println("i = " + i);
//            System.out.println("Hello from iteration number - " + i);
            System.out.println("myArray[" + i + "] - " + myArray[i]);
        }
    }
}
