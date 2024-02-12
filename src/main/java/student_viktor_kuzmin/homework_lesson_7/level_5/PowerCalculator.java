package student_viktor_kuzmin.homework_lesson_7.level_5;

class PowerCalculator {
    public double raisingToPower(double base, int exponent) {
        double result = 1;

        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        return exponent >= 0 ? result : 1 / result;
    }
}
