package student_dmitrij_petrass.lesson_3.level_3;

class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.robotName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.robotName();
    }
}
