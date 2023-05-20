public class Vehicle implements iSpeedCalculation {
    protected int maxSpeed;
    protected String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }

    @Override
    public double calculateAllowedSpeed() {
        return 0.0;
    }
}
