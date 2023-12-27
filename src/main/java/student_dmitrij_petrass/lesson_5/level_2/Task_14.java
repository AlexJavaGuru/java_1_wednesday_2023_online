package student_dmitrij_petrass.lesson_5.level_2;

class Task_14 {
    public static void main(String[] args) {
        int[]arrey = new int[3];

        arrey[0] = 20;
        arrey[1] = 30;
        arrey[2] = 40;

        int sum = 0;

        for (int i = 0; i < arrey.length; i++) {
            sum += arrey[i];
        }
        int result = sum / arrey.length;

        System.out.println("Arrey average value = " + result);
    }
}
