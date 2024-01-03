package teacher.lesson_9_interfaces.lessoncode;

public class UI {

    private WarehouseService warehouseService;

    public UI(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    public Box requestMainBox() {
        return warehouseService.getMainBox();
    }

    public void putPackage(Box box, Package newPackage) {
        boolean response = warehouseService.putPackage(box, newPackage);
        if (response) {
            System.out.println("Operation successful");
        } else {
            System.out.println("Operation failed");
        }
    }
}
