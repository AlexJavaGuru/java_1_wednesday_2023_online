package student_sergejs_kibals.homework2.level5;

class Dog {

    String name;
    int age;
    String color;

    Dog (String dogsName, int dogsAge, String dogsColor){
        this.name = dogsName;
        this.age = dogsAge;
        this.color = dogsColor;
    }

    void voice(){
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
    }
    void voice2(){
        System.out.println("Dog " + name + " is " + age + " years old.");
    }
    void happyBirthday(){
        this.age = age + 1;
    }
    void bark(){
        System.out.println("Gruff!");
    }
    void voice3(){
        System.out.println("Ruff! Now I am " + age + " years old.");
    }
    void voice4(){
        System.out.println("Dog " + name + " is " + age + " years old " + color + " dog.");
    }
    void changeColor(String newColor){
        this.color = newColor;
    }
}
