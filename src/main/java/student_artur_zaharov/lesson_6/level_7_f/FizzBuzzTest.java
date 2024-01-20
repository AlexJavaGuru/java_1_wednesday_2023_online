package student_artur_zaharov.lesson_6.level_7_f;



public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.testFizz();
        test.testBuzz();
    }

        private void checkTestResult (boolean condition, String testName){
            if (condition) {
                System.out.println(testName + " = OK!");
            } else {
                System.out.println(testName + " = FAIL!");
            }

        }
        public void testFizz() {
            FizzBuzz fizzBuzz = new FizzBuzz();

            String number = fizzBuzz.detect(15);
            checkTestResult("Fizz".equals(number), "Fizz");

        }
    public void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String number = fizzBuzz.detect(15);
        checkTestResult("Buzz".equals(number), "Buzz");

    }

    }



