package student_svetlana_daugele.lesson_14.level_1_and_2;

public class HeavyApplePredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
