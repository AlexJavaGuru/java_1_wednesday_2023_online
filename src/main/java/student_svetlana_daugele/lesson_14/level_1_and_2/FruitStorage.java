package student_svetlana_daugele.lesson_14.level_1_and_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FruitStorage {
    private List<Apple> apples;

    FruitStorage() {
        this.apples = getAllApples();
    }

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> getGreenApples() {
        return apples.stream()
                .filter(apple -> apple.getColor().equals("green"))
                .collect(Collectors.toList());
    }

    public List<Apple> findGreenApples(List<Apple> apples) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> getRedApples() {
        return apples.stream()
                .filter(apple -> apple.getColor().equals("red"))
                .collect(Collectors.toList());
    }

    public List<Apple> findApplesByColor(List<Apple> apples, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findApplesByWeight(List<Apple> apples, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() == weight) {
                result.add(apple);
            }
        }
        return result;
    }
    public List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}


