public class Rectangle implements IShape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return this.a * this.b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.a + this.b);
    }

    @Override
    public String toString() {
        return "Rectangle [a=" + a + ", b=" + b + "]";
    }
    
}
