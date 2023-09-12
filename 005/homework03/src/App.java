import Car.Car;
import Car.CarMagic;
import Car.CarMunicipalNissan;
import Car.Mercedes;
import Feature.CarFeature;
import Feature.CarMagicFeature;
import Feature.CarMunicipalFeature;
import GasStation.DieselEngine;
import GasStation.GasStation;
import GasStation.PetrolEngine;
import Interfaces.IEngine;

public class App {
    public static void main(String[] args) throws Exception {
        Mercedes car1 = new Mercedes();
        CarMagic car2 = new CarMagic();
        CarFeature commonCarFeature = new CarFeature();
        commonCarFeature.changeGear(car1);
        commonCarFeature.turnOnHeadlights(car2);

        CarMunicipalNissan car3 = new CarMunicipalNissan();
        CarMunicipalFeature municipalCarFeature = new CarMunicipalFeature();
        municipalCarFeature.sweepingStreet(car3);

        CarMagicFeature magicCarFeature = new CarMagicFeature();
        magicCarFeature.fly(car2);

        IEngine diesel1 = new DieselEngine();
        IEngine petrol1 = new PetrolEngine();

        GasStation gasStaion = new GasStation();
        gasStaion.wippingHeadlights(car3);
        
        car1.setEngineType(petrol1);
        car2.setEngineType(diesel1);

        car2.fueling();
        car1.fueling();
    }
}
