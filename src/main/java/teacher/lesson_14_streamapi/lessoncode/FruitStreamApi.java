package teacher.lesson_14_streamapi.lessoncode;

import teacher.lesson_14_streamapi.lessoncode.searchcriteria.AppleStreamCriteria;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitStreamApi {

    private List<Fruit> fruits = new ArrayList<>();

    public FruitStreamApi() {
        fruits.add(new Fruit("apple", "red", 50));
        fruits.add(new Fruit("apple", "green", 100));
        fruits.add(new Fruit("pear", "red", 100));
        fruits.add(new Fruit("pear", "yellow", 100));
        fruits.add(new Fruit("tomato", "red", 150));
    }


    public List<Fruit> getAllFruits() {
        return fruits;
    }


    public List<Fruit> findAllApples() {
//        for (Fruit fruit : fruits) {
//            if ("apple".equals(fruit.getTitle())) {
//                result.add(fruit);
//            }
//        }
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .collect(Collectors.toList());
    }


    public List<Fruit> findAllApplesV2() {
        return fruits.stream()
                .filter(new Predicate<>() {
                    @Override
                    public boolean test(Fruit fruit) {
                        return "apple".equals(fruit.getTitle());
                    }
                })
                .collect(Collectors.toList());
    }


    public List<Fruit> findAllApplesV3() {
        Predicate<Fruit> predicate = new Predicate<Fruit>() {
            @Override
            public boolean test(Fruit fruit) {
                return "apple".equals(fruit.getTitle());
            }
        };
        return fruits.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public List<Fruit> findAllApplesV4() {
        AppleStreamCriteria criteria = new AppleStreamCriteria();
        return fruits.stream()
                .filter(criteria)
                .collect(Collectors.toList());
    }

    public List<Fruit> filterFruitsByCriteria(FilterSearchCriteria criteria) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (criteria.test(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }

    public List<Fruit> findByCriteria(String title, String color, int weight) {
        Stream<Fruit> fruitStream = Stream.of(fruits)
                .flatMap(Collection::stream);
        if (title != null && !title.isEmpty()) {
            fruitStream = fruitStream
                    .filter(fruit -> title.equals(fruit.getTitle()));
        }
        if (color != null && !color.isEmpty()) {
            fruitStream = fruitStream
                    .filter(fruit -> color.equals(fruit.getColor()));
        }
        if (weight != 0) {
            fruitStream = fruitStream
                    .filter(fruit -> weight == fruit.getWeight());
        }
        return fruitStream
                .collect(Collectors.toList());
    }




    public List<Fruit> findRedApplesWithWeightBiggerThen100() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .filter(fruit -> "red".equals(fruit.getColor()))
                .filter(fruit -> fruit.getWeight() > 100)
                .collect(Collectors.toList());
    }


    public Set<String> findAllFruitUniqNames() {
        return fruits.stream()
                .map(Fruit::getTitle)
                .collect(Collectors.toSet());
    }


    public List<String> findAllFruitUniqueNames() {
        return fruits.stream()
                .map(fruit -> fruit.getTitle())
                .distinct()
                .collect(Collectors.toList());
    }


    public Optional<Fruit> findAnyApple() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .findAny();
    }


    public Optional<Fruit> findFirstApple() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .findFirst();
    }


    public Map<Integer, List<Fruit>> groupByWeight() {
        return fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getWeight));
    }


    public List<String> test() {
        Map<Integer, List<Fruit>> result = groupByWeight();
        Set<Map.Entry<Integer, List<Fruit>>> entries = result.entrySet();
        return entries.stream()
                .map(Map.Entry::getValue)
//				.map(entry -> entry.getValue())
                .flatMap(Collection::stream)
                .map(Fruit::getColor)
                .distinct()
                .collect(Collectors.toList());
    }
//        [
//          [Fruit{title='tomato', color='red', weight=150}],
//          [Fruit{title='apple', color='red', weight=50}],
//          [
//              Fruit{title='apple', color='green', weight=100},
//              Fruit{title='pear', color='red', weight=100},
//              Fruit{title='pear', color='yellow', weight=100}
//          ]
//        ]

    //[
    //  Fruit{title='tomato', color='red', weight=150},
    //  Fruit{title='pear', color='yellow', weight=100},
    //  Fruit{title='apple', color='red', weight=50},
    //  Fruit{title='pear', color='red', weight=100},
    //  Fruit{title='apple', color='green', weight=100}
    //]

    //[red, green, red, yellow, red]

    //[red, green, yellow]
}
