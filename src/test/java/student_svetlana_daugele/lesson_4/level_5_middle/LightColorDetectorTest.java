package student_svetlana_daugele.lesson_4.level_5_middle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LightColorDetectorTest {
    LightColorDetector lightColorDetector = new LightColorDetector();
    int waveLength;

    @Test
     public void shouldDetectVioletTest (){
        waveLength = 380;
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detectColor(waveLength);
        assertEquals(expectedResult, actualResult);


    }

}