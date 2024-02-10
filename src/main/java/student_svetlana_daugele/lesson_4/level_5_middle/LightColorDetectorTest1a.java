package student_svetlana_daugele.lesson_4.level_5_middle;

class LightColorDetectorTest1a {
    public static void main(String[] args) {
        LightColorDetectorTest1a lightColorDetectorTest = new LightColorDetectorTest1a();
        lightColorDetectorTest.testViolet();
        lightColorDetectorTest.testBlue();
        lightColorDetectorTest.testGreen();
        lightColorDetectorTest.testYellow();
        lightColorDetectorTest.testOrange();
        lightColorDetectorTest.testRed();
        lightColorDetectorTest.testInvisible();
    }
    public void testViolet() {
        int waveLength = 380;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detectColor(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }
    public void testBlue() {
        int waveLength = 450;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detectColor(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }
    public void testGreen() {
        int waveLength = 495;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detectColor(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }
    public void testYellow() {
        int waveLength = 570;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detectColor(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }

    public void testOrange() {
        int waveLength = 590;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detectColor(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }
    public void testRed() {
        int waveLength = 620;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detectColor(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }

    public void testInvisible() {
        int waveLength = 751;
        String expectedResult = "Invisible";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detectColor(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Invisible test = OK");
        } else {
            System.out.println("Invisible test = FAIL");
        }
    }
}


/*
Написать тестовые сценарии для класса LightColorDetector
в классе LightColorDetectorTest1a. Тестовые сценарии должны
покрывать все возможные варианты.

public static void main(String[] args) {
		LightColorDetectorTest1a lightColorDetector = new LightColorDetectorTest1a();
		lightColorDetector.testViolet(405);
		lightColorDetector.testBlue(475);
		lightColorDetector.testGreen(505);
		lightColorDetector.testYellow(585);
		lightColorDetector.testOrange(619);
		lightColorDetector.testRed(620);
		lightColorDetector.testInvisible(760);
	}
	public void testViolet(int wavelength) {
		String result = lightColorDetector.detect(wavelength);
		checkResults(result.equals("Violet"), "LightColorDetector test - Violet");
	}
 */
/*
380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
 */