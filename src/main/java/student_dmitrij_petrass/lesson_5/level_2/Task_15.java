package student_dmitrij_petrass.lesson_5.level_2;

class Task_15 {

    public static void main(String[] args) {
        int[]array = new int[3];

        array[0] = 5;
        array[1] = 10;
        array[2] = 15;

        for (int i = 0; i < array.length; i++) {
            System.out.println("My array [" + i + "] - " + array[i]);

        int result = array[i] * 2;
            System.out.println("My array * 2 [" + i + "] - " + result);
        }
    }
}
