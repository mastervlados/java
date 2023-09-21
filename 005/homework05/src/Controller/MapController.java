package Controller;

import Controller.Interfaces.IGPSSensor;
import Model.Local.TripHistory;
import Model.Local.Interfaces.ITripHistory;
import Model.Network.Interfaces.ICityObjectsRepository;

public class MapController {
    ICityObjectsRepository cityObjectsRepo;

    public MapController(ICityObjectsRepository repo) {
        this.cityObjectsRepo = repo;
        this.method2();
    }

    public void method2() {
        this.cityObjectsRepo.showCityObjectsList();
        IGPSSensor cheapGPSSensor = new GPSSensor();
        ITripHistory tripHistory = new TripHistory();
        TripController tripController = new TripController(cheapGPSSensor, tripHistory);
    }

    public void ping() {
        System.out.println("Pong!");
    }
}
