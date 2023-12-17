package student_dmitrijs_voronins.lesson_3.Level_5;

class Dog {
    String name;
    int age;
    String color;

    public Dog(String newName, String newColor, int newAge) {

        name = newName;
        color = newColor;
        age = newAge;

    }

    public void voice() {
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);


    }
    public void happyBirthDay(){
        System.out.println("Happy Birth day!" + name);
    }


}

