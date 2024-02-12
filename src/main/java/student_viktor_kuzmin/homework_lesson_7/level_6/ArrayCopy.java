package student_viktor_kuzmin.homework_lesson_7.level_6;

class ArrayCopy {
    public int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int num : in) {
            if (num >= numberFrom && num <= numberTo) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : in) {
            if (num >= numberFrom && num <= numberTo) {
                result[index++] = num;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numberFrom = 3;
        int numberTo = 7;

        int[] result = arrayCopy.copyInRange(inputArray, numberFrom, numberTo);

        System.out.println("Result array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
