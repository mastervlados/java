package gb.homework;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void testIsCarInstanceOfVehicle() {
        Car mercedes = new Car("Mercedes", "Summer", 2018);
        assertThat(mercedes, instanceOf(Vehicle.class));
    }

    @Test
    public void testHasCarFourWheels() {
        Car lamborghini = new Car("Automobili Lamborghini S.p.A.", "Autumn", 2019);
        assertEquals(4, lamborghini.getNumWheels());
    }

    @Test
    public void testCarSpeedInTestDriveMode() {
        Car ferrari = new Car("Ferrari", "Winter", 2020);
        ferrari.testDrive();
        assertTrue(ferrari.getSpeed() >= 60);
    }

    @Test
    public void testCarParking() {
        Car gelentwagen = new Car("Gelentwagen", "Winter", 2022);
        gelentwagen.testDrive();
        gelentwagen.park();
        assertTrue(gelentwagen.getSpeed() == 0);
    }
}
