package student_dmitrij_petrass.lesson_4.level_7;


public class FizzBuzz {

    public String detect(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
        }
        return String.valueOf(number);
    }

}
