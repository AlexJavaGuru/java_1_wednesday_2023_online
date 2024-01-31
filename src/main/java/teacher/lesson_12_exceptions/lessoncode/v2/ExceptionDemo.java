package teacher.lesson_12_exceptions.lessoncode.v2;

import java.util.Optional;

public class ExceptionDemo {

    public static void main(String[] args) {
        BankLoginService bankLoginService = new BankLoginService();

        Optional<User> user;
        try {
            user = bankLoginService.findUser(1L, "1234");
        } catch (IllegalAccessException | IllegalArgumentException e) {
            System.out.println("Something went wrong...");
            System.out.println(e.getMessage());
            throw new RuntimeException("Something went wrong...", e);
        } finally {
            System.out.println("Release connection");
        }

        user
                .map(User::getName)
                .ifPresent(System.out::println);

        System.out.println("I'm still working");
    }
}
