package student_viktor_kuzmin.homework_lesson_3.level_5;

class Dog {

    private final String name;
    private int age;
    private String colour;

    public Dog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public void voice() {
        System.out.println(name + " " + name + " " + name);

    }
    public void changeColour(String newColor) {
        colour = newColor;
        System.out.println(name + " now have a new colour: " + colour);
    }

    public void voice1() {
        System.out.println(this.name + ", " + this.age + " years.");
    }

    public void voice2() {
        System.out.println(this.name + ", " + this.age + " years, " + this.colour + ".");
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }


    public void happyBirthday() {
        age++;
        System.out.println(name + " have a birthday today. Now he is " + age + " years.");
    }
}