package student_aleksandra_azbuka.lesson_3;

class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Sharik", 3, "black");
        myDog.voice();
        myDog.happyBirthday();
        myDog.voice();
        myDog.changeColor("orange");
        myDog.voice();
    }
}
