package student_viktor_kuzmin.lesson_9.level_4;

class TemperatureConverterTest {
    public static void main(String[] args) {

        testKelvinConverter();
        testFahrenheitConverter();
    }

    public static void testKelvinConverter() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double celsiusTemp1 = 0;
        double expectedKelvin1 = 273.15;
        double resultKelvin1 = kelvinConverter.convert(celsiusTemp1);
        if (resultKelvin1 == expectedKelvin1) {
            System.out.println("KelvinConverter test passed");
        } else {
            System.out.println("KelvinConverter test failed");
        }
    }

    public static void testFahrenheitConverter() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double celsiusTemp1 = 0;
        double expectedFahrenheit1 = 32;
        double resultFahrenheit1 = fahrenheitConverter.convert(celsiusTemp1);
        if (resultFahrenheit1 == expectedFahrenheit1) {
            System.out.println("KelvinConverter test passed");
        } else {
            System.out.println("KelvinConverter test failed");
        }
    }
}

