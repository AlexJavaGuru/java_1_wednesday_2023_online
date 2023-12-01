package teacher.lesson_4_if_statement.lessoncode;

public class Car {

    boolean isEngineOn;
    int currentSpeed;

    void speedUp() {
        if (isEngineOn) {
            //currentSpeed = currentSpeed + 1;
            currentSpeed++; // increment by 1
        } else {
            System.out.println("Engine is OFF");
        }
    }
}
