package teacher.lesson_8_inheritance.lessoncode.inheritance;

public class PetrolCar extends Car {

    private int fuelTankLevel;

    public PetrolCar(String brand, String color, boolean isEngineOn, int currentSpeed, int fuelTankLevel) {
        super(brand, color, isEngineOn, currentSpeed);
        this.fuelTankLevel = fuelTankLevel;
    }

    public void fillTheTank(int lit) {
        fuelTankLevel = lit;
    }

    @Override
    public void startStopEngine() {
        if (fuelTankLevel > 0) {
            super.startStopEngine();
        } else {
            System.out.println("No fuel...");
        }
    }

    public int getFuelTankLevel() {
        return fuelTankLevel;
    }
}
