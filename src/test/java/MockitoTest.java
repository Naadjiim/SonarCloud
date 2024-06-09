import org.example.User;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MockitoTest {

    @Test
    void mockTest() {
        List<String> mockedList = Mockito.mock(List.class);
        mockedList.add("one");
        verify(mockedList).add("one");
    }

    @Test
    void getUserDetails() {
        UserService userService = Mockito.mock(UserService.class);
        User user = new User("John", "Doe");
        when(userService.getUserDetails("john")).thenReturn(user);

        User result = userService.getUserDetails("john");
        assertEquals("John", result.getFirstname());
        assertEquals("Doe", result.getLastname());
    }

    @Test
    void verifyUserCreation() {
        UserService userService = Mockito.mock(UserService.class);
        User user = new User("John", "Doe");

        userService.createUser(user);
        verify(userService).createUser(user);
    }

}
