package student_aleksandrs_jeleckis.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog shakal = new Dog("Shakal", 5, "Black");

        shakal.voice();
        shakal.happyBirthday();
        shakal.voice();
        shakal.changeColor("White");
        shakal.voice();

    }
}
