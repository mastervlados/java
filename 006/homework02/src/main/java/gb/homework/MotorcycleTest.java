package gb.homework;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class MotorcycleTest {
    Motorcycle moto;

    @Test
    public void testIsMotoInstanceOfVehicle() {
        assertThat(this.moto, instanceOf(Vehicle.class));
    }

    @Test
    public void testHasMotoTwoWheels() {
        assertEquals(2, this.moto.getNumWheels());
    }

    @Test
    public void testMotoSpeedInTestDriveMode() {
        this.moto.testDrive();
        assertTrue(this.moto.getSpeed() >= 75);
    }

    @Test
    public void testMotoParking() {
        this.moto.testDrive();
        this.moto.park();
        assertTrue(this.moto.getSpeed() == 0);
    }

    @Before
    public void setUp() {
        this.moto = new Motorcycle("Comp-1", "Spring", 2020);
    }
}
