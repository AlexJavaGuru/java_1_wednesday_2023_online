package student_aleksandra_azbuka.lesson_3;
import java.util.Scanner;

class Dog {
    String name;
    Integer age;
    String color;
    public Dog(String dogName, int dogAge, String color) {
        this.name = dogName;
        this.age = dogAge;
        this.color = color;

    }

    void voice() {
        System.out.println(name + ", " + age + ", " + color);
    }

    void happyBirthday() {
        age++;
        System.out.println("Happy Birthday!");
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }
}
