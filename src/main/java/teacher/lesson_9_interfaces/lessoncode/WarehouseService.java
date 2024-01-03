package teacher.lesson_9_interfaces.lessoncode;

public class WarehouseService {

    private BoxService boxService;

    public WarehouseService(BoxService boxService) {
        this.boxService = boxService;
    }

    public Box getMainBox() {
        return boxService.prepareMainBox();
    }

    public boolean putPackage(Box mainBox, Package newPackage) {
        int nextFreeIndex = boxService.getNextFreeIndex(mainBox);
        return boxService.putPackageIntoTheBox(mainBox, newPackage, nextFreeIndex);
    }

}
