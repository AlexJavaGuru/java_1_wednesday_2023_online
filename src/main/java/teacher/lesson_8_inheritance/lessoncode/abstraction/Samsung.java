package teacher.lesson_8_inheritance.lessoncode.abstraction;

public class Samsung extends SmartPhone {

    public Samsung(String brand, String OS) {
        super(brand, OS);
    }

    @Override
    void transferData() {
        System.out.println("Transfer data with Bluetooth");
    }

    @Override
    void chargePhone() {
        System.out.println("Samsung is charging slowly...");
    }
}
