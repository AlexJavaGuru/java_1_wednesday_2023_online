package teacher.lesson_5_arrays_for_loop.lessoncode;

public class ForLoopExample {

    public static void main(String[] args) {
        int[] myArray = new int[5];

        myArray[0] = 10;
        myArray[1] = 10;
        myArray[2] = 15;
        myArray[3] = 2;
        myArray[4] = 25;

        for (int i = 0; i < myArray.length; i++) {
//            System.out.println("i = " + i);
//            System.out.println("Hello from iteration number - " + i);
            System.out.println("myArray[" + i + "] - " + myArray[i]);
        }

        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        for (int number : myArray) {
            if (number > max) {
                max = number;
            }
        }

        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
