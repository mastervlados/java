package Feature;

import Car.CarMunicipal;
import Interfaces.ICarServiceBehaviour;

public class CarMunicipalFeature extends CarFeature implements ICarServiceBehaviour {

    @Override
    public void sweepingStreet(CarMunicipal car) {
        System.out.println("Sweeping the street.");
    }
    
}
