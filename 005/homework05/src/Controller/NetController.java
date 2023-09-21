package Controller;

import Model.Network.Interfaces.ICamerasRepository;
import Model.Network.Interfaces.ICurrentTrafficRepository;
import Model.Network.Interfaces.IRoadsRepository;

public class NetController {
    IRoadsRepository roads;
    ICurrentTrafficRepository currentTraffic;
    ICamerasRepository cameras;

    public NetController(IRoadsRepository roads, ICurrentTrafficRepository currentTraffic, ICamerasRepository cameras) {
        this.roads = roads;
        this.cameras = cameras;
        this.currentTraffic = currentTraffic;
    }

    public void loadRepositories() {
        this.roads.showRoadsList();
        this.currentTraffic.showCurrentTrafficList();
        this.cameras.showCamerasList();
    }
}
