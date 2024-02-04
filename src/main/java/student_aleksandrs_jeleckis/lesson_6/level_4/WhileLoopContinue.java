package student_aleksandrs_jeleckis.lesson_6.level_4;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 10) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("You are out of the While loop");
    }
}
