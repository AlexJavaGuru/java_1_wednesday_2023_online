package student_svetlana_daugele.lesson_7.level_5;

class PowerCalculator {

    public int calculateNumberInPower(int number, int power) {
        int result = numberInPower(number, power);
        printPowerResult(number, power, result);

        return result;
    }

    int numberInPower(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = result * number;
        }
        return result;
    }

    public void printPowerResult(int number, int power, int result) {
        System.out.println("Number is " + number);
        System.out.println("Power is  " + power);
        System.out.println("Number in power is  " + result);
    }
}
