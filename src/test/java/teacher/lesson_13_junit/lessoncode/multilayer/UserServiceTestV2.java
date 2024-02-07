package teacher.lesson_13_junit.lessoncode.multilayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import teacher.lesson_12_exceptions.lessoncode.v2.User;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
//@RunWith(JUnitPlatform.class)
class UserServiceTestV2 {

    @Mock
    DataBaseImpl dataBase;

    @InjectMocks
    UserService userService;

    @Captor
    ArgumentCaptor<User> argumentCaptor;

    @Test
    void testAddUser() {
        long userId = 1L;
        String userName = "Alex";
        when(dataBase.add(any())).thenReturn(true);

        boolean actualResult = userService.addUser(userId, userName);
        assertTrue(actualResult, "User not added");

        verify(dataBase, times(1)).add(any());
        verify(dataBase).add(argumentCaptor.capture());

        User actualUser = argumentCaptor.getValue();
        User expectedUser = new User(userId, userName);
        assertEquals(expectedUser, actualUser, "Users are not equal");
    }

    @Test
    void testSearchById() {
        long userId = 1L;
        String userName = "Alex";
        when(dataBase.search(eq(1L))).thenReturn(new User(userId, userName));
        User expectedUser = new User(userId, userName);

        User actualResult = userService.searchById(1L);
        assertEquals(expectedUser, actualResult, "Users are not equal");
        User actualNull = userService.searchById(2L);
        assertNull(actualNull, "Should not contain user with id = 2");
    }
}