package student_svetlana_daugele.lesson_4.level_5_middle;

class LightColorDetectorTest1 {
    public static void main(String[] args) {
        LightColorDetectorTest1 lightColorDetector = new LightColorDetectorTest1();
        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }

    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(wavelength);
        checkResults(result.equals("Violet"), "LightColorDetector test - Violet");
    }
    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(wavelength);
        checkResults(result.equals("Blue"), "LightColorDetector test - Blue");
    }
    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(wavelength);
        checkResults(result.equals("Green"), "LightColorDetector test - Green");
    }
    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(wavelength);
        checkResults(result.equals("Yellow"), "LightColorDetector test - Yellow");
    }
    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(wavelength);
        checkResults(result.equals("Orange"), "LightColorDetector test - Orange");
    }
    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(wavelength);
        checkResults(result.equals("Red"), "LightColorDetector test - Red");
    }
    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(wavelength);
        checkResults(result.equals("Invisible"), "LightColorDetector test - Invisible");
    }
    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
