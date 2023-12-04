package student_aleksandrs_jeleckis.lesson_3.level_5;

class Dog {

    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;

    }

    public void voice() {
        System.out.println(name + " " + age + " " + color);
        System.out.println(name + " " + age + " " + color);
        System.out.println(name + " " + age + " " + color);
    }

    public void happyBirthday() {
        age++;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }
}