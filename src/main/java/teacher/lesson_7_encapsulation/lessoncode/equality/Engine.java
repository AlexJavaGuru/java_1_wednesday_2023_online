package teacher.lesson_7_encapsulation.lessoncode.equality;

import java.util.Objects;

public class Engine {

    private String brand;
    private double kw;

    public Engine(String brand, double kw) {
        this.brand = brand;
        this.kw = kw;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "brand='" + brand + '\'' +
                ", kw=" + kw +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(kw, engine.kw) == 0 &&
                Objects.equals(brand, engine.brand);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getKw() {
        return kw;
    }

    public void setKw(double kw) {
        this.kw = kw;
    }
}
