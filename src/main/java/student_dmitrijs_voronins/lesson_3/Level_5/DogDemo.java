package student_dmitrijs_voronins.lesson_3.Level_5;

public class DogDemo {
    public static void main(String[] args) {

        Dog Max = new Dog("Max", "Black", 10);


        Max.voice();
        System.out.println(Max.name);
        System.out.println(Max.age);
        System.out.println(Max.color);
        Max.happyBirthDay();
        Max.voice();
        Max.age = Max.age + 1;

        System.out.println(" now is " + Max.age + " years old");


    }

    public static class Demo {
        public static void main(String[] args) {
            Dog sharik = new Dog("Sharik","Men",20);


            System.out.println(sharik.age);
            System.out.println(sharik.name);

            System.out.println(sharik.color);






            System.out.println();

            sharik.age = sharik.age + 1;

            System.out.println("Sharik now is"+  sharik.age +  "years old");


        }
    }
}
