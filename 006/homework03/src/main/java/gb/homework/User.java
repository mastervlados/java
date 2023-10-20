package gb.homework;

public class User {

    String name;
    String password;


    boolean isAuthenticate = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean getAuthenticate() {
        return isAuthenticate;
    }
    public void setAuthenticate(boolean authenticate) {
        isAuthenticate = authenticate;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }

    public void logOut() { this.setAuthenticate(false); }

    public void logIn() { this.setAuthenticate(true); }

}