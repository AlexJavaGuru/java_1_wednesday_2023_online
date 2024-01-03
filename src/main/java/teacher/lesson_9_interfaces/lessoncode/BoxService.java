package teacher.lesson_9_interfaces.lessoncode;

public interface BoxService {

    Box prepareMainBox();

    int getNextFreeIndex(Box box);

    boolean putPackageIntoTheBox(Box box, Package newPackage, int byIndex);

}
