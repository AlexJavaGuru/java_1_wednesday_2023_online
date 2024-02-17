package student_svetlana_daugele.lesson_14.level_1_and_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class FruitStorageTest {
    private FruitStorage fruitStorage;

    @BeforeEach
    void setUp() {
        fruitStorage = new FruitStorage();
    }

    @Test
    void testGetAllApples() {
        List<Apple> allApples = fruitStorage.getAllApples();
        Assertions.assertNotNull(allApples);
        Assertions.assertEquals(8, allApples.size());
    }

    @Test
    void testGetGreenApples() {
        List<Apple> greenApples = fruitStorage.getGreenApples();
        Assertions.assertNotNull(greenApples);
        Assertions.assertEquals(3, greenApples.size());
        for (Apple apple : greenApples) {
            Assertions.assertEquals("green", apple.getColor());
        }
    }

    @Test
    void testGetRedApples() {
        List<Apple> redApples = fruitStorage.getRedApples();
        Assertions.assertNotNull(redApples);
        Assertions.assertEquals(3, redApples.size());
        for (Apple apple : redApples) {
            Assertions.assertEquals("red", apple.getColor());
        }
    }

    @Test
    void testFindGreenApples() {
        List<Apple> greenApples = fruitStorage.findGreenApples(fruitStorage.getAllApples());
        Assertions.assertNotNull(greenApples);
        Assertions.assertEquals(3, greenApples.size());
        for (Apple apple : greenApples) {
            Assertions.assertEquals("green", apple.getColor());
        }
    }

    @Test
    void findApplesByColor() {
        List<Apple> redApples = fruitStorage.findApplesByColor(fruitStorage.getAllApples(), "red");
        List<Apple> greenApples = fruitStorage.findApplesByColor(fruitStorage.getAllApples(), "green");
        List<Apple> yellowApples = fruitStorage.findApplesByColor(fruitStorage.getAllApples(), "yellow");

        Assertions.assertEquals(3, redApples.size());
        Assertions.assertEquals(3, greenApples.size());
        Assertions.assertEquals(2, yellowApples.size());

        for (Apple apple : redApples) {
            Assertions.assertEquals("red", apple.getColor());
        }

        for (Apple apple : greenApples) {
            Assertions.assertEquals("green", apple.getColor());
        }

        for (Apple apple : yellowApples) {
            Assertions.assertEquals("yellow", apple.getColor());
        }
    }

    @Test
    void findApplesByWeight() {
        List<Apple> applesByWeight200 = fruitStorage.findApplesByWeight(fruitStorage.getAllApples(), 200);
        Assertions.assertEquals(2, applesByWeight200.size());
        for (Apple apple : applesByWeight200) {
            Assertions.assertEquals(200, apple.getWeight());
        }

    }

}


