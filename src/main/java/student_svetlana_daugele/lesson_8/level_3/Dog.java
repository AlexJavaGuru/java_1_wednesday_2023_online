package student_svetlana_daugele.lesson_8.level_3;

class Dog  extends Animal {
    public Dog (String name, int age){
        super(name, age);
    }

    @Override
    public void speak() {
        System. out.println ("Vau-Vau!");
    }
}
