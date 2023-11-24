package student_svetlana_daugele.lesson_3.level_5_middle;

public class Dog {
    private final String name;
    private int age;
    private String color;
    public Dog (String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void voice() {
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        }

    public void voice1() {
        System.out.println("My name is " + name + ". "+ "My age is " + age + " years.");
    }
    public void voice2() {System.out.println("Woof-woof");
    }

    public void happyBirthday() {age++;
    }
    public int getAge() {
        return age;
    }
    public void happyBirthday1(){System.out.println("I have a birthday today.");}

public void celebrations (){System.out.println("Now I am " + age + " years old.");
    }
    public void dogsColor(){System.out.println("My color is  " + color + ".");
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }
    public String getColor() {
        return color;
    }

}
