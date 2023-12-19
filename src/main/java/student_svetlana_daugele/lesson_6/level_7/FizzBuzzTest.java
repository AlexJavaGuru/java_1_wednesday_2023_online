package student_svetlana_daugele.lesson_6.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzDetectTest("FizzBuzz", 15);
        fizzBuzzTest.fizzBuzzDetectTest("Fizz", 6);
        fizzBuzzTest.fizzBuzzDetectTest("Buzz", 10);
        fizzBuzzTest.fizzBuzzDetectTest("NotFizzBuzz", 4);
    }

    private void fizzBuzzDetectTest(String expectedResult, int number) {
        FizzBuzz fizzBuzz =  new FizzBuzz();
        String result = fizzBuzz.detect(number);
        if (expectedResult == result){
            System.out.println( expectedResult + " test is ok");

            }
                else {
                    System.out.println( expectedResult + " test is failed");
                }
            }
}
