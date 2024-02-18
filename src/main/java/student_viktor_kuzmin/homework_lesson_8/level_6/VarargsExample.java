package student_viktor_kuzmin.homework_lesson_8.level_6;

class VarargsExample {

    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

   public static void main(String[] args) {
        printNumbers(1, 2, 3);
        System.out.println("----------");
        printNumbers(10, 20, 30, 40, 50);

    }
}

