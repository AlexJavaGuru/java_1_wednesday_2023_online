package student_slava_subacius;

public class DogDemo {
    public static void main(String[] args) {
        Dog cika = new Dog("Cika","Papijon",3,"Black");
        cika.vois();
        cika.happyBirthday();

        System.out.println("This is Cika");
        System.out.println(cika.getName());
        System.out.println(cika.getAge());
        System.out.println(cika.getColor());
        System.out.println(" Years old: " + cika.getAge());


    }
}
