package student_slava_subacius.lesson_8_3;

class Motorbike extends Vehicle {
    public Motorbike(String model, int year) {
        super(model,year);
    }
    @Override
    public void start() {
        System.out.println("Starting the motorbike...");
    }
}
