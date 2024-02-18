package student_viktor_kuzmin.homework_lesson_8.level_3;

public class JackRussel extends Dog{

    private String color;

    public JackRussel(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    @Override
    void makeSomeNoise() {
        System.out.println("Gav Gav!");
    }
}

