package student_sergejs_kibals.homework2;

public class RobotDemo {

    public static void main(String[] args) {

        Robot Robot1 = new Robot("Rider");
        Robot Robot2 = new Robot("John");

        Robot1.sayHello();
        Robot1.sayYourName();

        Robot2.sayHello();
        Robot2.sayYourName();
    }
}
