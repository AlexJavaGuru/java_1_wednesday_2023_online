package teacher.lesson_12_exceptions.lessoncode.v1;

import teacher.lesson_12_exceptions.lessoncode.v1.User;

import java.util.Optional;

public class ExceptionDemo {

    public static void main(String[] args) {
        BankLoginService bankLoginService = new BankLoginService();

        User user;
        try {
            user = bankLoginService.findUser(1L, null);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            System.out.println("Something went wrong...");
            System.out.println(e.getMessage());
            throw new RuntimeException("Something went wrong...", e);
        } finally {
            System.out.println("Release connection");
        }

        Optional.ofNullable(user)
                .map(User::getName)
                .ifPresent(System.out::println);

        System.out.println("I'm still working");
    }
}
