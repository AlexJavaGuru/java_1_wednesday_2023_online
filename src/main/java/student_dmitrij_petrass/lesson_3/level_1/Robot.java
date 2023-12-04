package student_dmitrij_petrass.lesson_3.level_1;

class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello!");

    }

    public void sayYourName() {
        System.out.println("My name is" + name);
    }

}