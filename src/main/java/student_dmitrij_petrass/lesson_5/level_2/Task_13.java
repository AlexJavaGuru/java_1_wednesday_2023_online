package student_dmitrij_petrass.lesson_5.level_2;

class Task_13 {
    public static void main(String[] args) {
        int[] arrey = new int[3];

        arrey[0] = 20;
        arrey[1] = 10;
        arrey[2] = 2;
        int sum = 0;

        for (int i = 0; i < arrey.length; i++) {
            sum += arrey[i];
        }
        System.out.println("Arreys SUM = " + sum);
    }
}
