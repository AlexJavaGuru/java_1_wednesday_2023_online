package teacher.lesson_13_junit.lessoncode.multilayer;

import teacher.lesson_12_exceptions.lessoncode.v2.User;

public class UserService {

    private DataBase dataBase;

    public UserService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public boolean addUser(Long userId, String name) {
        if (userId == null || name == null) {
            return false;
        }

        User user = new User(userId * 10, name);
        boolean result = dataBase.add(user);
        if (result) {
            System.out.println("User was added with userId: " + userId + ", name: " + name);
        } else {
            System.out.println("Some problem");
        }
        return result;
    }

    public User searchById(Long id) {
        return dataBase.search(id);
    }
}
