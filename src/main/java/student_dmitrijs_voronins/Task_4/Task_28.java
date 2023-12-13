package student_dmitrijs_voronins.Task_4;

import java.util.Random;

public class Task_28 {
    public static void main(String[] args) {
        int[] myArray = new int[7];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(101);
            System.out.print(myArray[i] + " ");
        }

        int min = myArray[0];
        for(int i = 0; i < myArray.length; i++){
            if(min>myArray[i]){
                min = myArray[i];
            }
        }
        System.out.println("Min is : " + min);
    }

}

