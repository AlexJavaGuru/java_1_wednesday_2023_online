package student_slava_subacius;

class DemoRobot {
    public static void main(String[] args) {


        Robot robot = new Robot("My name is ROBO", "Hello");

        robot.sayYourName();
        robot.sayHello();

        System.out.println("My name is ROBO");
        System.out.println("Hello");
        String name = ("Rider");
        String name1 = ("John");
        System.out.println(name + "\n" + name1);

        Robot robot1 = new Robot("Rider");
        Robot robot2 = new Robot("John");

        robot1.sayYourName();
        robot2.sayYourName();


    }

}
