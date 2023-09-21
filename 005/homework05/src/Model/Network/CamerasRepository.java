package Model.Network;

import Model.Network.Interfaces.ICamerasRepository;

public class CamerasRepository implements ICamerasRepository {

    @Override
    public void showCamerasList() {
        System.out.println("Network : Cameras");
        
    }
    
}
