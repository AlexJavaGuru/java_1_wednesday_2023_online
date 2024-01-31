package teacher.lesson_12_exceptions.lessoncode.v1;

import java.util.ArrayList;
import java.util.List;

public class BankLoginService {

    private static final String ACCESS_TOKEN = "1234";

    private List<User> users;

    public BankLoginService() {
        users = new ArrayList<>();
        users.add(new User(1L, "Alex"));
        users.add(new User(2L, "Oleg"));
        users.add(new User(3L, "Artur"));
        users.add(new User(4L, "Kate"));
        users.add(new User(5L, "Who?"));
    }

    public User findUser(Long userId, String token) throws IllegalAccessException {
        if (token == null || userId == null) {
            throw new IllegalArgumentException("One or more arguments are null");
        }

        if (!ACCESS_TOKEN.equals(token)) {
            throw new IllegalAccessException("Token is invalid");
        }

        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }
}
