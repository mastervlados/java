package gb.homework;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
       this.data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void usersLogOut() {
        for (User user : this.data) {
            if (!(user instanceof Admin)) {
                user.logOut();
                System.out.println("Bye!");
            }
        }
    }
}