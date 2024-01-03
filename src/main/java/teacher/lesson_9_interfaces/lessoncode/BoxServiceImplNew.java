package teacher.lesson_9_interfaces.lessoncode;

import java.util.Random;

public class BoxServiceImplNew implements BoxService {


    @Override
    public Box prepareMainBox() {
        return new Box();
    }

    @Override
    public int getNextFreeIndex(Box box) {
        int index = new Random().nextInt(10);
        System.out.println("Index found" + index);
        return index;
    }

    @Override
    public boolean putPackageIntoTheBox(Box box, Package newPackage, int byIndex) {
        System.out.println("Placing package into the box by index 1000 times faster..." + byIndex);
        return true;
    }
}
