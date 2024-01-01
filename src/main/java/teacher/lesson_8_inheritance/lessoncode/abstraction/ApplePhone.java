package teacher.lesson_8_inheritance.lessoncode.abstraction;

public class ApplePhone extends SmartPhone {

    public ApplePhone(String brand, String OS) {
        super(brand, OS);
    }

    @Override
    void transferData() {
        System.out.println("Transfer data with ThunderBolt");
    }

    @Override
    void chargePhone() {
        System.out.println("Already charged!");
    }

    @Override
    public void something() {
        System.out.println("some thing...");
    }
}
