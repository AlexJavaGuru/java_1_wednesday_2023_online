package student_slava_subacius.lesson_8_3;

class MotorCar extends Vehicle {
    public MotorCar(String model, int year) {
        super(model, year);
    }
    @Override
    public void start() {
        System.out.println("Starting the car...");
    }
}
