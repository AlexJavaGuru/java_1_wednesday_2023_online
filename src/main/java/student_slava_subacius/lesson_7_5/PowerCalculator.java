package student_slava_subacius.lesson_7_5;

class PowerCalculator {

    public double calculatePower(double base, int exponent) {
            double result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
    }
}
