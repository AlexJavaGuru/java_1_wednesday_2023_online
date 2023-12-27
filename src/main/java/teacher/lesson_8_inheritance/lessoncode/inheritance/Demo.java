package teacher.lesson_8_inheritance.lessoncode.inheritance;

public class Demo {

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("X3", "White", false, 0, 100);
        PetrolCar bmw = new PetrolCar("X5", "Black", false, 0, 0);

        tesla.accelerate();
        tesla.startStopEngine();
        tesla.accelerate();
        System.out.println(tesla.getCurrentSpeed());

        bmw.startStopEngine();
        bmw.accelerate();
        System.out.println(bmw.getCurrentSpeed());


    }
}
