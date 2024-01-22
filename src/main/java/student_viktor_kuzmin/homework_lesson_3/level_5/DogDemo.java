package student_viktor_kuzmin.homework_lesson_3.level_5;

class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog("Dzhim", 9, "brown&white");
        System.out.println("My dogs name: " + myDog.getName());
        System.out.println("My dogs age: " + myDog.getAge() + " years");
        System.out.println("New dogs colour: " + myDog.getColour());

        System.out.println("Voice:");
        myDog.voice();

        System.out.println("Voice1:");
        myDog.voice1();

        System.out.println("Voice2:");
        myDog.voice2();

        myDog.happyBirthday();

        myDog.changeColour("green");
    }
}

