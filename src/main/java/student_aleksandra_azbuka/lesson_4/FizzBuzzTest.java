package student_aleksandra_azbuka.lesson_4;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizz();
        fizzBuzzTest.buzz();
        fizzBuzzTest.fizzBuzz();
    }

    public void fizz() {
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(9);

        if (realResult.equals(expectedResult)){
            System.out.println("Test Fizz passed");
        } else {
            System.out.println("Test Fizz failed");
        }
    }

    public void buzz() {
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(25);
        if (realResult.equals(expectedResult)){
            System.out.println("Test Buzz passed");
        } else {
            System.out.println("Test Buzz failed");
        }
    }

    public void fizzBuzz() {
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        if (realResult.equals(expectedResult)){
            System.out.println("Test FizzBuzz passed");
        } else {
            System.out.println("Test FizzBuzz failed");
        }
    }
}
