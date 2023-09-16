public class Triangle implements IShape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double halfPerimeter = this.getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.a) * (halfPerimeter - this.b) * (halfPerimeter - this.c));
    }

    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public String toString() {
        return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
    }
    
}
