package student_dmitrij_petrass.lesson_3.level_7;

class CarDemo {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "E90M3", 2010, 300.8);
        String carManufacturer = bmw.getCarManufacturer();
        String carModel = bmw.getCarModel();
        int year = bmw.getYear();
        double horsePower = bmw.getHorsePower();


        System.out.println("Car = " + carManufacturer);
        System.out.println("Model = " + carModel);
        System.out.println("Year = " + year);
        System.out.println("HorsePower = " + horsePower);

        System.out.println();
        System.out.println("Please make tuning of my BMW");
        bmw.moreHorsePower2Stage();
        bmw.engineSoundAfterTuning();


    }
}
