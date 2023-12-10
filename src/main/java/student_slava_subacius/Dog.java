package student_slava_subacius;

class Dog {
    private String name;
    private String breed;
    private int age;
    private String color;

    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    public void vois() {
        System.out.println("Wof");
        System.out.println("Wof");
        System.out.println("Wof");
    }
    public void dog() {
        System.out.println("Dog " + name + age + color);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    void happyBirthday() {
        age++;
    }
    void changeColor(String newColor) {
        this.color = newColor;
    }
    public void setColor() {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }

}


























