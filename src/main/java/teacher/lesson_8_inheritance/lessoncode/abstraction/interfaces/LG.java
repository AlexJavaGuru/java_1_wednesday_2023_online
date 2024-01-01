package teacher.lesson_8_inheritance.lessoncode.abstraction.interfaces;

public class LG implements TV {

    private int channel;
    private boolean onOff;
    private int volume;

    @Override
    public void turnOnOff() {
        System.out.println("Turn of with LG logo");
        onOff = !onOff;
    }

    @Override
    public void changeChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void volumeUp() {
        volume++;
    }

    @Override
    public void volumeDown() {
        volume--;
    }

    @Override
    public void channelUp() {
        channel++;
    }

    @Override
    public void channelDown() {
        channel--;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public int getVolume() {
        return volume;
    }
}
