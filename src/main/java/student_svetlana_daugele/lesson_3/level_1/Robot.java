package student_svetlana_daugele.lesson_3.level_1;

public class Robot {

    public void sayHello()
    {
        System.out.println("Hello! ");
    }
    public Robot() {

    }

    public void sayYourName() {
        System.out.println("My name is ROBO");

    }

        String name;
        Robot(String robotName) {
        this.name = robotName;
    }
        public void sayYourName1() {
        System.out.println("My name is " + this.name);
    }
    }

