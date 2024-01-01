package teacher.lesson_8_inheritance.lessoncode.abstraction;

public abstract class SmartPhone {

    protected String brand;
    protected String OS;

    public SmartPhone(String brand, String OS) {
        this.brand = brand;
        this.OS = OS;
    }

    abstract void transferData();

    abstract void chargePhone();

    public void something() {
        System.out.println("No such function...");
    }

    public void receiveCalls() {
        System.out.println("Ring Ring!");
    }

    public void makeCalls(long recipientNumber) {
        System.out.println("Calling to - " + recipientNumber);
    }

    public void sendSMS(String text) {
        System.out.println("Sending SMS with the text" + text);
    }
}
