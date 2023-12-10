package teacher.lesson_3_oop_first_look.lessoncode;

public class DemoMethods {

    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik", "Street", "Black", 5, 4.6, true);
        Dog bobik = new Dog("Bobik", "Kolli", "Yellow", 2, 3.6, true);

        sharik.setAge(10);

        System.out.println(sharik.isHungry());
        System.out.println(bobik.isHungry());

        System.out.println();
        if (bobik.isHungry()) {
            bobik.eat("Meat");
        }
        sharik.eat("Banana");

        System.out.println(sharik.isHungry());
        System.out.println(bobik.isHungry());

        sharik.bark();

        sharik.sleep();
        bobik.sleep();
    }
}
