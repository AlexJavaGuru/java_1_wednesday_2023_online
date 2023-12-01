package student_aleksandrs_jeleckis.lesson_3.level_robot;

class Robot {
    String name;

    public Robot() {
    }

    Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("my name is ROBO");
    }

    public void sayYourRealName() {
        System.out.println("my name is " + name);
    }

    public String getName() {
        return name;
    }

}