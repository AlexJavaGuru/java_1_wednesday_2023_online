package teacher.lesson_8_inheritance.lessoncode.abstraction.interfaces;

public class Demo {

    /*
    static  - method overloading
    dynamic - method overriding
     */

    public static void main(String[] args) {
        TV lgTv = new LG();
        TV philipsTv = new Philips();

//        lgTv.turnOnOff();
//        philipsTv.turnOnOff();

        RemoteControl remoteControlLg = new RemoteControl(lgTv);
        remoteControlLg.turnOnOff();

        RemoteControl remoteControlPhilips = new RemoteControl(philipsTv);
        remoteControlPhilips.turnOnOff();

    }
}
