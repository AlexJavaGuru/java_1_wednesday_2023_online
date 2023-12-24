package teacher.lesson_7_encapsulation.lessoncode.equality;

public class CarDemo {

    public static void main(String[] args) {
        Engine mitsubisi = new Engine("Mits", 300);
        Car car1 = new Car("BMW", "Black", false, 2023, mitsubisi);
        Car car2 = car1;
        Car car3 = new Car("BMW", "Black", false, 2023, mitsubisi);

        if (car1.equals(car1)) {
            System.out.println("Car1 is equal to Car1");
        }
        if (car1.equals(car2)) {
            System.out.println("Car1 is equal to Car2");
        }
        if (car1.equals(car3)) {
            System.out.println("Car1 is equal to Car3");
        }

        System.out.println(car1);
    }
}
