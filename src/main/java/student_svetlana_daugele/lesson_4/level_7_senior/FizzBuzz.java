package student_svetlana_daugele.lesson_4.level_7_senior;

class FizzBuzz {

    public String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return " " + number;

        }
    }

}

