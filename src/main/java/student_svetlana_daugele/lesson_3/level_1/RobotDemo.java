package student_svetlana_daugele.lesson_3.level_1;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();
robot.sayHello();
robot.sayYourName();

Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot.sayYourName();
        robot1.sayYourName1();


        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot.sayYourName();
        robot2.sayYourName1();
    }
}