package student_dmitrij_petrass.lesson_5.level_4;

class Task_28 {

    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25, 30};


        for (int i = 0; i < array.length; i++) {
            System.out.println("Array length " + "[" + i + "] : " + array[i]);
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            System.out.println("MIN number of array " + min);
        }
    }
}

