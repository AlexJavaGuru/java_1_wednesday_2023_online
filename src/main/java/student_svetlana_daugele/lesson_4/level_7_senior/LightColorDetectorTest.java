package student_svetlana_daugele.lesson_4.level_7_senior;

class LightColorDetectorTest {

	public static void main(String[] args) {
		LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
		lightColorDetectorTest.test("Violet", 405);//Available test names : "Violet", "Green", "Blue", "Yellow", "Orange", "Red", "Invisible Light"
		lightColorDetectorTest.test("Blue", 475);
		lightColorDetectorTest.test("Green", 505);
		lightColorDetectorTest.test("Yellow", 585);
		lightColorDetectorTest.test("Orange", 619);
		lightColorDetectorTest.test("Red", 620);
		lightColorDetectorTest.test("Invisible", 760);
		lightColorDetectorTest.test("Invisible Light", 100);
	}
	public void test (String testName, int wavelength){
		LightColorDetector lightColorDetector = new LightColorDetector();
		String result = lightColorDetector.detect(wavelength);
		if (testName.equals(result)){
        System.out.println(testName + " test = OK");
		}
		else  {
			System.out.println(testName + " test = FAIL");
		}
	}

}
