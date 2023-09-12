package Feature;

import Car.Car;
import Interfaces.ICarBasicBehaviour;
import Interfaces.ICarDriverInteraction;

public class CarFeature implements ICarDriverInteraction, ICarBasicBehaviour {

    @Override
    public void changeGear(Car car) {
        System.out.println("The gear was changed.");
    }

    @Override
    public void turnOnHeadlights(Car car) {
       System.out.println("Headlights were turned on.");
    }

    @Override
    public void turnOnWipers(Car car) {
        System.out.println("Wipers were turned on.");
    }

    @Override
    public void move(Car car) {
       System.out.println("Moved.");
    }

    @Override
    public void shipping(Car car) {
        System.out.println("Get some stuff for transporting.");
    }
    
}
