package teacher.lesson_8_inheritance.lessoncode.abstraction.interfaces;

public class Philips implements TV {

    private int channel;
    private boolean onOff;
    private int volume;

    @Override
    public void turnOnOff() {
        System.out.println("Turn of with Philips logo");
        onOff = !onOff;
    }

    @Override
    public void changeChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public void channelUp() {

    }

    @Override
    public void channelDown() {

    }
}
