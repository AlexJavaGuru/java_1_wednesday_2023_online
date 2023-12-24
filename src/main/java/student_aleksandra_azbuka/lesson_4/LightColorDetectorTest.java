package student_aleksandra_azbuka.lesson_4;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleLightTest();
    }
    public void violetTest() {
        int waveLength = 400;
        String expectedResult = "Violet";
        LightColorDetector Detector = new LightColorDetector();
        String realResult = Detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Test Violet = PASS");
        } else {
            System.out.println("Test Violet = FAIL");
        }
    }
    public void blueTest() {
        int waveLength = 455;
        String expectedResult = "Blue";
        LightColorDetector Detector = new LightColorDetector();
        String realResult = Detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Test Blue = PASS");
        } else {
            System.out.println("Test Blue = FAIL");
        }
    }
    public void greenTest() {
        int waveLength = 500;
        String expectedResult = "Green";
        LightColorDetector Detector = new LightColorDetector();
        String realResult = Detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Test Green = PASS");
        } else {
            System.out.println("Test Green = FAIL");
        }
    }
    public void yellowTest() {
        int waveLength = 577;
        String expectedResult = "Yellow";
        LightColorDetector Detector = new LightColorDetector();
        String realResult = Detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Test Yellow = PASS");
        } else {
            System.out.println("Test Yellow = FAIL");
        }
    }
    public void orangeTest() {
        int waveLength = 599;
        String expectedResult = "Orange";
        LightColorDetector Detector = new LightColorDetector();
        String realResult = Detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Test Orange = PASS");
        } else {
            System.out.println("Test Orange = FAIL");
        }
    }
    public void redTest() {
        int waveLength = 630;
        String expectedResult = "Red";
        LightColorDetector Detector = new LightColorDetector();
        String realResult = Detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Test Red = PASS");
        } else {
            System.out.println("Test Red = FAIL");
        }
    }
    public void invisibleLightTest() {
        int waveLength = 100;
        String expectedResult = "Invisible Light";
        LightColorDetector Detector = new LightColorDetector();
        String realResult = Detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Test Invisible Light = PASS");
        } else {
            System.out.println("Test Invisible Light = FAIL");
        }
    }
}