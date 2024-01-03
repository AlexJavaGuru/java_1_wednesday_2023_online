package teacher.lesson_9_interfaces.lessoncode;

public class Demo {

    public static void main(String[] args) {
        BoxService boxService = new BoxServiceImplNew();
        WarehouseService warehouseService = new WarehouseService(boxService);
        UI userInterface = new UI(warehouseService);

        Box box = userInterface.requestMainBox();
        userInterface.putPackage(box, new Package("Headset"));

    }
}
