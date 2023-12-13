package student_dmitrijs_voronins.Task_4;

import java.util.Random;

public class Task_27 {


    public static void main(String[] args) {
        int[] myArray = new int[7];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(101);
            System.out.print(myArray[i] + " ");
        }

        int max = myArray[0];
        for(int i = 0; i < myArray.length; i++){
            if(max< myArray[i]){
                max = myArray[i];
            }
        }
        System.out.println("Max is : " + max);
    }

}




//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите наибольшее число в массиве и выведети его на консоль.