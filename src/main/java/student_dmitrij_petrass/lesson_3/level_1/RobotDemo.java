package student_dmitrij_petrass.lesson_3.level_1;

import javax.xml.namespace.QName;
import java.util.concurrent.BrokenBarrierException;

class RobotDemo {
    public static void main(String[] args) {
        Robot bro = new Robot("BRO");
        bro.sayHello();
        bro.sayYourName();

        Robot r2d2 = new Robot("R2D2");
        r2d2.sayHello();
        r2d2.sayYourName();

    }

}
