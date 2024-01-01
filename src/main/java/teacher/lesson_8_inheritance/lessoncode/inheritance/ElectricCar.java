package teacher.lesson_8_inheritance.lessoncode.inheritance;

public class ElectricCar extends Car {

    private int batteryCharge;

    public ElectricCar(String brand, String color, boolean isEngineOn, int currentSpeed, int batteryCharge) {
        super(brand, color, isEngineOn, currentSpeed);
        this.batteryCharge = batteryCharge;
    }

    public void charge() {
        while (batteryCharge <= 100) {
            batteryCharge++;
        }
    }

    @Override
    public void startStopEngine() {
        if (batteryCharge > 0) {
            super.startStopEngine();
        }
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }
}
