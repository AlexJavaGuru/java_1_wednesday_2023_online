package student_aleksandrs_jeleckis.lesson_4.level_5;

 class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();
        test.violetTest();
        test.blueTest();
        test.greenTest();
        test.yellowTest();
        test.orangeTest();
        test.redTest();
        test.invisLightTest();

    }

    public void violetTest() {
        int wavelenghtNumber = 380;
        String expectedResult = "Violet";
        LightColorDetector violet = new LightColorDetector();
        String realResult = violet.detect(wavelenghtNumber);
        if (realResult == expectedResult) {
            System.out.println("Violet light");
        } else {
            System.out.println("Not Violet light");
        }
    }

    public void blueTest() {
        int wavelenghtNumber = 450;
        String expectedResult = "Blue";
        LightColorDetector blue = new LightColorDetector();
        String realResult = blue.detect(wavelenghtNumber);
        if (realResult == expectedResult) {
            System.out.println("Blue light");
        } else {
            System.out.println("Not Blue light");
        }
    }

    public void greenTest() {
        int wavelenghtNumber = 496;
        String expectedResult = "Green";
        LightColorDetector green = new LightColorDetector();
        String realResult = green.detect(wavelenghtNumber);
        if (realResult == expectedResult) {
            System.out.println("Green light");
        } else {
            System.out.println("Not Green light");
        }
    }

    public void yellowTest() {
        int wavelenghtNumber = 571;
        String expectedResult = "Yellow";
        LightColorDetector yellow = new LightColorDetector();
        String realResult = yellow.detect(wavelenghtNumber);
        if (realResult == expectedResult) {
            System.out.println("Yellow light");
        } else {
            System.out.println("Not Yellow light");
        }
    }

    public void orangeTest() {
        int wavelenghtNumber = 593;
        String expectedResult = "Orange";
        LightColorDetector orange = new LightColorDetector();
        String realResult = orange.detect(wavelenghtNumber);
        if (realResult == expectedResult) {
            System.out.println("Orange light");
        } else {
            System.out.println("Not Orange light");
        }
    }
    public void redTest(){
        int wavelenghtNumber = 624;
        String expectedResult = "Red";
        LightColorDetector red = new LightColorDetector();
        String realResult = red.detect(wavelenghtNumber);
        if (realResult == expectedResult){
            System.out.println("Red light");
        } else{
            System.out.println("Not Red light");
        }
    }
    public void invisLightTest(){
        int wavelenghtNumber = 999;
        String expectedResult = "Invisible Light";
        LightColorDetector invisLight = new LightColorDetector();
        String realResult = invisLight.detect(wavelenghtNumber);
        if (realResult == expectedResult){
            System.out.println("Invisible Light");
        } else{
            System.out.println("Not Invisible Light");
        }
    }
}
