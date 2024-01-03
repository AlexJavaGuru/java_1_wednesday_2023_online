package student_svetlana_daugele.lesson_8.level_3;

class Cat extends Animal {
    public Cat (String name, int age){
        super(name, age);
    }

    @Override
    public void speak() {
        System. out.println ("Miau-Miau!");
    }
}
