package Controller;

import Controller.Interfaces.IGPSSensor;
import Model.Local.Interfaces.ITripHistory;
import Model.Network.CamerasRepository;
import Model.Network.CurrentTrafficRepository;
import Model.Network.RoadsRepository;
import Model.Network.Interfaces.ICamerasRepository;
import Model.Network.Interfaces.ICurrentTrafficRepository;
import Model.Network.Interfaces.IRoadsRepository;

public class TripController {
    IGPSSensor gps;
    ITripHistory tripHistory;

    public TripController(IGPSSensor gps, ITripHistory tripHistory) {
        this.gps = gps;
        this.tripHistory = tripHistory; 
        this.method1();
    }

    public void method1() {
        IRoadsRepository roads = new RoadsRepository();
        ICurrentTrafficRepository currentTraffic = new CurrentTrafficRepository();
        ICamerasRepository cameras = new CamerasRepository();

        NetController netController = new NetController(roads, currentTraffic, cameras);

        netController.loadRepositories();
    }
}
