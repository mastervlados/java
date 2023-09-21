package Model.Network;

import Model.Network.Interfaces.ICityObjectsRepository;

public class CityObjectsRepository implements ICityObjectsRepository {

    @Override
    public void showCityObjectsList() {
        System.out.println("Network : City objects");
        
    }
    
}
