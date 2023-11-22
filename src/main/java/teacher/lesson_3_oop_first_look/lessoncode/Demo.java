package teacher.lesson_3_oop_first_look.lessoncode;

public class Demo {

    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik", "Street", "Black", 5, 4.6, true);
        Dog bobik = new Dog("Bobik", "Kolli", "Yellow", 2, 3.6, true);

        System.out.println("This is Sharik");
        System.out.println(sharik.getAge());
        System.out.println(sharik.getName());
        System.out.println(sharik.getBreed());
        System.out.println(sharik.getColor());
        System.out.println(sharik.getWeight());

        System.out.println("This is Bobik");
        System.out.println(bobik.getAge());
        System.out.println(bobik.getName());
        System.out.println(bobik.getBreed());
        System.out.println(bobik.getColor());
        System.out.println(bobik.getWeight());

        System.out.println();

        sharik.setAge(100);
        System.out.println("Sharik now is " + sharik.getAge() + " years old");
    }

}
