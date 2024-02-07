package teacher.lesson_13_junit.lessoncode.multilayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import teacher.lesson_12_exceptions.lessoncode.v2.User;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserService userService;
    DataBaseMock dataBaseMock;

    @BeforeEach
    void setUp() {
        dataBaseMock = new DataBaseMock();
        userService = new UserService(dataBaseMock);
    }

    @Test
    void testAddUser() {
        long userId = 1L;
        String userName = "Alex";

        boolean actualResult = userService.addUser(userId, userName);
        assertTrue(actualResult, "User not added");
        assertTrue(dataBaseMock.isMethodAddWasTriggered(), "Method from Mock was not triggered");
        User parameterForMethodAdd = dataBaseMock.getParameterForMethodAdd();
        User actualExpectedParameter = new User(userId, userName);
        assertEquals(parameterForMethodAdd, actualExpectedParameter, "Users are not equal");
    }
}