package teacher.lesson_8_inheritance.lessoncode.abstraction;

public class Demo {

    public static void main(String[] args) {
        SmartPhone applePhone = new ApplePhone("16PRO", "iOS");
        SmartPhone samsung = new Samsung("X20", "Android");

        applePhone.sendSMS("Hello from iPhone");
        samsung.sendSMS("Hello from Samsung");

        applePhone.transferData();
        samsung.transferData();

        WirelessCharger wirelessCharger = new WirelessCharger();
        wirelessCharger.charge(applePhone);
        wirelessCharger.charge(samsung);


        SmartPhone[] smartPhonesArray = new SmartPhone[2];
        smartPhonesArray[0] = applePhone;
        smartPhonesArray[1] = samsung;

        for (SmartPhone smartPhone : smartPhonesArray) {
            smartPhone.something();
        }
    }
}
