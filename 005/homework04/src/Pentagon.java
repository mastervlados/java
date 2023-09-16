public class Pentagon implements IShape {

    private double a;

    public Pentagon(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.pow(this.a, 2) / 4 * Math.sqrt(25 + 10 * Math.sqrt(5));
    }

    @Override
    public double getPerimeter() {
        return 5 * this.a;
    }

    @Override
    public String toString() {
        return "Pentagon [a=" + a + "]";
    }
    
}
