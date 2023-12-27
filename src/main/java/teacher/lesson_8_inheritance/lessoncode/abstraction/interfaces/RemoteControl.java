package teacher.lesson_8_inheritance.lessoncode.abstraction.interfaces;

public class RemoteControl {

    private TV controlledTv;

    public RemoteControl(TV controlledTv) {
        this.controlledTv = controlledTv;
    }

    public void addVolume() {
        controlledTv.volumeUp();
    }

    public void decreaseVolume() {
        controlledTv.volumeDown();
    }

    public void turnOnOff() {
        controlledTv.turnOnOff();
    }
}
