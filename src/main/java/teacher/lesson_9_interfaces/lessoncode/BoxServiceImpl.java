package teacher.lesson_9_interfaces.lessoncode;

import java.util.Random;

public class BoxServiceImpl implements BoxService {

    @Override
    public Box prepareMainBox() {
        return new Box();
    }

    @Override
    public int getNextFreeIndex(Box box) {
        System.out.println("Searching for the next Index");
        System.out.println("Please stand by...");
        return new Random().nextInt(10);
    }

    @Override
    public boolean putPackageIntoTheBox(Box box, Package newPackage, int byIndex) {
        System.out.println("Slowly placing package into the box by index" + byIndex);
        return true;
    }
}
