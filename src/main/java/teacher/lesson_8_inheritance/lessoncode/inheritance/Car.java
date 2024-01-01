package teacher.lesson_8_inheritance.lessoncode.inheritance;

public class Car {

    private String brand;
    private String color;
    private boolean isEngineOn;
    private int currentSpeed;

    public Car(String brand, String color, boolean isEngineOn, int currentSpeed) {
        this.brand = brand;
        this.color = color;
        this.isEngineOn = isEngineOn;
        this.currentSpeed = currentSpeed;
    }

    public void accelerate() {
        if (isEngineOn) {
            currentSpeed++;
        } else {
            System.out.println("Engine is Off");
        }
    }

    public void startStopEngine() {
        isEngineOn = !isEngineOn;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
