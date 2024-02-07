package teacher.lesson_13_junit.lessoncode.multilayer;

import teacher.lesson_12_exceptions.lessoncode.v2.User;

import java.util.List;

public class DataBaseImpl implements DataBase {

    private List<User> users;

    public DataBaseImpl(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean add(User user) {
        return users.add(user);
    }

    @Override
    public User search(Long userId) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }
}
