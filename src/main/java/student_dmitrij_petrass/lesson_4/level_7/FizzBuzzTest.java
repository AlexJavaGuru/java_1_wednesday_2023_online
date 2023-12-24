package student_dmitrij_petrass.lesson_4.level_7;

public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizz();
        fizzBuzzTest.buzz();
        fizzBuzzTest.fizzBuzz();
    }

    private void fizz() {
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(3);

        if (realResult.equals(expectedResult)){
            System.out.println("FIZZ test = has passed!");
        } else {
            System.out.println("FIZZ test = FAIL");
        }
    }
    private void buzz() {
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(10);

        if (realResult.equals(expectedResult)){
            System.out.println("FIZZ test = has passed!");
        } else {
            System.out.println("FIZZ test = FAIL");
        }
    }

    private void fizzBuzz() {
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(30);

        if (realResult.equals(expectedResult)){
            System.out.println("FIZZ test = has passed!");
        } else {
            System.out.println("FIZZ test = FAIL");
        }
    }
}
