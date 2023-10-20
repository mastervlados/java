package gb.homework;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;


public class UserRepositoryTest {
    UserRepository repo1;
    @BeforeEach
    void setUp() {
        repo1 = new UserRepository();
        repo1.addUser(new User("Gas", "123"));
        repo1.addUser(new User("Tormoz", "123"));
        repo1.addUser(new Admin());
        repo1.addUser(new User("Left", "123"));
        repo1.addUser(new User("Right", "123"));
        repo1.addUser(new Admin());
        for (User user : repo1.data) {
            user.logIn();
            System.out.println("Hello!");
        }
    }

    @Test
    void usersLogOut() {
        repo1.usersLogOut();
        for (User user : repo1.data) {
            if (user instanceof Admin) {
                assertEquals(true, user.getAuthenticate());
            } else {
                assertEquals(false, user.getAuthenticate());
            }
        }
    }
}
