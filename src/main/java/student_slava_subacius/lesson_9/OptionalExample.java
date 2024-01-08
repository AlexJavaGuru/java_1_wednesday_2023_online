package student_slava_subacius.lesson_9;

import java.util.Optional;
public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> emptyOptional = Optional.empty();
        Optional<String> presentOptional = Optional.of("Hello");
        Optional<String> nullableOptional = Optional.ofNullable(null);

        System.out.println("Is emptyOptional present? " + emptyOptional.isPresent());
        System.out.println("Is presentOptional present? " + presentOptional.isPresent());
        System.out.println("Is nullableOptional present? " + nullableOptional.isPresent());

        String value = presentOptional.get();
        System.out.println("Value inside presentOptional: " + value);
    }
}