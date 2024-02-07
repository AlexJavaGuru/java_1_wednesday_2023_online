package student_viktor_kuzmin.homework_lesson_3.level_1;

 class Robot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");

    }

    public void sayYourName() {
        System.out.println("My name is ROBO");

    }

    public void sayYourTrueName() {
        System.out.println("My name is " + name);
    }
}