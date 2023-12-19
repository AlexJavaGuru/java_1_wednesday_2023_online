package student_svetlana_daugele.lesson_6.level_4;
import java.util.Random;
class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] array = createAndFillArray(3,4);
        int sum = calculateSum(array);
        System.out.println("The sum of all numbers in double dimension  array is  " + sum);
        printArray(array);
    }

    public static int [] [] createAndFillArray(int rows,int columns){
        int[][] array = new int[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(40);
            }
        }
        return array;
    }

    public static int calculateSum(int[][] array) {
        int sum = 0;

        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }

        return sum;
    }
    public static void printArray(int[][] array) {
            System.out.println("Two dimension array:");
            for (int[] row : array) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
    }
}