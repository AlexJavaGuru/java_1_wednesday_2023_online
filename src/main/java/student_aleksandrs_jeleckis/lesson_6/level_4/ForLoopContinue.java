package student_aleksandrs_jeleckis.lesson_6.level_4;

class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 10) {
                continue;
            }
            System.out.println(+i);
        }
        System.out.println("You are out of the For loop");
    }
}
