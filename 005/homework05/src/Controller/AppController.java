package Controller;

import Model.Network.CityObjectsRepository;
import Model.Network.Interfaces.ICityObjectsRepository;
import View.Interfaces.IGUI;
import View.Interfaces.IUX;

public class AppController {
    IGUI mainGUI;
    IUX mainUX;

    public AppController(IGUI userInterface, IUX userExperience) {
        this.mainGUI = userInterface;
        this.mainUX = userExperience;
        ICityObjectsRepository cityObjects = new CityObjectsRepository();
        MapController mapController = new MapController(cityObjects);
        mapController.ping();
    }
}
