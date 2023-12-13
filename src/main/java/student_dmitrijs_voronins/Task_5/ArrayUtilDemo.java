package student_dmitrijs_voronins.Task_5;




import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArray = arrayUtil.createArray(50);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(myArray));
        scanner.nextInt();



    }
}