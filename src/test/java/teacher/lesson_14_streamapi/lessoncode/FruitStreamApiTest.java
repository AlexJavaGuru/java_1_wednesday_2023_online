package teacher.lesson_14_streamapi.lessoncode;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class FruitStreamApiTest {

    @Test
    void testColors() {
        FruitStreamApi victim = new FruitStreamApi();

        List<String> result = victim.test();
        System.out.println(result);


    }

    @Test
    void testReduce() {
        List<Integer> number = List.of(1, 2, 3, 4);

        Integer sum = number.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}