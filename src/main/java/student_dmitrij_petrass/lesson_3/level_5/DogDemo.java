package student_dmitrij_petrass.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog debby = new Dog("Debby", 2.5, "White", "Black");
        String dogsName = debby.getDogsName();
        System.out.println("Dogs name = " + dogsName + dogsName + dogsName);
        System.out.println(debby.getAge());
        debby.voice();

        System.out.println();
        System.out.println("Debby celebrates her birthday");
        debby.voice();
        debby.happyBirthday();

        System.out.println();
        debby.voice();
        System.out.println(dogsName);
        System.out.println(debby.getAge());
        System.out.println(debby.getColor());

        System.out.println();
        debby.voice();
        System.out.println("Debby repaint yourself please");
        debby.voice();
        System.out.println("Debby new color = " + debby.getNewColor());
    }
}