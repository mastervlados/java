package Feature;

import Car.CarMagic;
import Interfaces.ICarMagicBehaviour;

public class CarMagicFeature extends CarFeature implements ICarMagicBehaviour {

    @Override
    public void fly(CarMagic car) {
        System.out.println("Whooooaaa!");    
    }
    
}
