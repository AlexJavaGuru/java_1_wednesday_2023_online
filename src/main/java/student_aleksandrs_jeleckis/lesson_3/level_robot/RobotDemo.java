package student_aleksandrs_jeleckis.lesson_3.level_robot;

class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.sayHello();
        robot.sayYourName();

        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot("Rider");
        robot3.sayHello();
        robot3.sayYourRealName();

        Robot robot4 = new Robot("John");
        robot4.sayHello();
        robot4.sayYourRealName();
    }
}
