package student_artur_zaharov.lesson_3.level5;

class Dog {

    private String name;
    String color;


    int age;


    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;


    }
    void voice (){
        System.out.println (name + " color " + color);
        System.out.println (name);
        System.out.println (name + " color " + color);
        System.out.println (age + " years");

    }
    void happyBirthday(){

        System.out.println(name+ " now " + (age + 1) + " years old");
    }

    void changeColor(String newColor) {
        System.out.println("Change color now " + newColor);

    }



}


