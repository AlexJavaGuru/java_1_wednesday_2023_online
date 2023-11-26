package student_sergejs_kibals.homework2;

class Dog {

    String name;
    int age;

    Dog (String dogsName, int dogsAge){
        this.name = dogsName;
        this.age = dogsAge;
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
}
