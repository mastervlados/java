import Controller.AppController;
import View.UserExperience;
import View.UserInterface;
import View.Interfaces.IGUI;
import View.Interfaces.IUX;

public class App {
    public static void main(String[] args) throws Exception {
        IGUI userInterface = new UserInterface();
        IUX userExperience = new UserExperience();

        AppController appController = new AppController(userInterface, userExperience);

    }
}
