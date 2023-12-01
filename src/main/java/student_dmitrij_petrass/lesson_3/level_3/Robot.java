package student_dmitrij_petrass.lesson_3.level_3;

class Robot {
    private String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void robotName() {
        System.out.println("My name is" + this.name);
    }
}
