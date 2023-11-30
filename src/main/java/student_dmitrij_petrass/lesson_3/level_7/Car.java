package student_dmitrij_petrass.lesson_3.level_7;

class Car {
    private String carManufacturer;
    private String carModel;
    private int year;
    private double horsePower;

    public Car(String carManufacturer, String carModel, int year, double horsePower) {
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
        this.year = year;
        this.horsePower = horsePower;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getYear() {
        return year;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void moreHorsePower2Stage() {
        System.out.println(horsePower + 250);
    }

    public void engineSoundAfterTuning() {
        System.out.println("Vrum-vrum");
    }
}
