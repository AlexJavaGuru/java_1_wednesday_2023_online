package student_dmitrij_petrass.lesson_4.level_7;

public class FizzBuzzTest {

    public static void main(String[] args) {

        testNumberDivOnThreeAndFive();

    }

    public static void testNumberDivOnThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = "FizzBuzz";
        String actualResult = fizzBuzz.detect(30);

        check(expectedResult, actualResult, "Test 1: number divides on number 3 and 5");

    }


    private static void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " Failed!");
        }
    }
}
