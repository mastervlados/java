package gb.homework;

public class Admin extends User {
    int permissionLevel;

    public Admin() {
        super("SuperUser", "1234");
        this.permissionLevel = 1;
    }
}
