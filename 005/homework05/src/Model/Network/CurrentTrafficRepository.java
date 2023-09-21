package Model.Network;

import Model.Network.Interfaces.ICurrentTrafficRepository;

public class CurrentTrafficRepository implements ICurrentTrafficRepository {

    @Override
    public void showCurrentTrafficList() {
        System.out.println("Network : Current traffic");
        
    }
    
}
