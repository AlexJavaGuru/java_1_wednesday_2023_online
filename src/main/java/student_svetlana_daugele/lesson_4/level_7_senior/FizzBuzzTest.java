package student_svetlana_daugele.lesson_4.level_7_senior;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizz();
        fizzBuzzTest.buzz();
        fizzBuzzTest.fizzBuzz();
        fizzBuzzTest.notFizzBuzz();

    }

    public void fizz() {
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(3);

        if (realResult.equals(expectedResult)){
                System.out.println("FIZZ test = OK");
        } else {
                System.out.println("FIZZ test = FAIL");
            }
        }

    public void buzz() {
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(10);
        if (realResult.equals(expectedResult)){
            System.out.println("BUZZ test = OK");
        } else {
            System.out.println("BUZZ test = FAIL");
        }
    }
    public void fizzBuzz() {
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(30);
        if (realResult.equals(expectedResult)){
            System.out.println("FIZZBUZZ test = OK");
        } else {
            System.out.println("FIZZBUZZ test = FAIL");
        }
    }
    public void notFizzBuzz() {
        int number = 2;
        String expectedResult = " " + number;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(2);
        if (realResult.equals(expectedResult)){
            System.out.println("notFIZZBUZZ test = OK");
        } else {
            System.out.println("notFIZZBUZZ test = FAIL");
        }
    }

}


/*
Создайте класс FizzBuzz.
В классе FizzBuzz создайте метод со следующей сигнатурой:

class FizzBuzz {

    public String detect(int number) {
        // Реализуйте следующие требования:
        // - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
    }

}

Создайте класс FizzBuzzTest и напишите автоматические тесты,
которые покрывают все возможные сценарии.
 */