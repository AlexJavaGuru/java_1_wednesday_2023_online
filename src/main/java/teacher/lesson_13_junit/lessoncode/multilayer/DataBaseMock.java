package teacher.lesson_13_junit.lessoncode.multilayer;

import teacher.lesson_12_exceptions.lessoncode.v2.User;

public class DataBaseMock implements DataBase {

    private boolean methodAddWasTriggered;
    private User parameterForMethodAdd;

    @Override
    public boolean add(User user) {
        parameterForMethodAdd = user;
        methodAddWasTriggered = true;
        return true;
    }

    @Override
    public User search(Long userId) {
        return null;
    }

    public boolean isMethodAddWasTriggered() {
        return methodAddWasTriggered;
    }

    public User getParameterForMethodAdd() {
        return parameterForMethodAdd;
    }
}
