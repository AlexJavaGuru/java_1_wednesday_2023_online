package teacher.lesson_7_encapsulation.lessoncode.equality;

import java.util.Date;
import java.util.Objects;

public class Car extends Object {

    private String brand;
    private String color;
    private boolean isEngineOn;
    private int year;
    private Engine engine;



    public Car(String brand, String color, boolean isEngineOn, int year, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.isEngineOn = isEngineOn;
        this.year = year;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isEngineOn=" + isEngineOn +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isEngineOn == car.isEngineOn &&
                year == car.year &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(color, car.color) &&
                Objects.equals(engine, car.engine);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
