package teacher.lesson_3_oop_first_look.lessoncode;

class Dog {

    private String name;
    private String breed;
    private String color;
    private double weight;
    private int age;
    private boolean isHungry;

    public Dog(String name, String breed, String color, int age, double weight, boolean isHungry) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.isHungry = isHungry;
    }

    public void bark() {
        System.out.println("Wof");
        System.out.println("Wof");
        System.out.println("Wof");
    }

    public void sleep() {
        System.out.println("Dog " + name + " is sleeping");
    }

    public void eat(String givenFood) {
        System.out.println(name + " eat " + givenFood);
        this.isHungry = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
