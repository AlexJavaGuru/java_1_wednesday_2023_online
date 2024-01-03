package student_svetlana_daugele.lesson_8.level_3;

abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void speak();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

