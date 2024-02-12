package student_aleksandrs_jeleckis.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;

        int[][] randomArray = new int[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                randomArray[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Initial array:");
        printArray(randomArray);

        int totalSum = calculateTotalSum(randomArray);
        System.out.println("Total sum of all numbers from array: " + totalSum);
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static int calculateTotalSum(int[][] array) {
        int totalSum = 0;
        for (int[] row : array) {
            for (int value : row) {
                totalSum += value;
            }
        }
        return totalSum;
    }
}