package teacher.lesson_13_junit.lessoncode.multilayer;

import teacher.lesson_12_exceptions.lessoncode.v2.User;

public interface DataBase {

    boolean add(User user);

    User search(Long userId);
}
