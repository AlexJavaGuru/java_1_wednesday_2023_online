package student_viktor_kuzmin.homework_lesson_8.level_3;

abstract class Dog {

    protected String name;
    protected int age;

    public Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void makeSomeNoise();
}
