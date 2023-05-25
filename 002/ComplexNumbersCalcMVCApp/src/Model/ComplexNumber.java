package Model;

public class ComplexNumber {

    /** Real number */
    private double a;
    /** Image number (with "i" postfix) */
    private double b;

    /**
     * First constructor - create new Complex Number
     * 
     * @param a - real part
     * @param b - image part (with 'i' post-prefix)
     */
    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Second constructor - create new Complex Number
     * 
     * @param c - when both real and image parts are the same
     */
    public ComplexNumber(double c) {
        this(c, c);
    }

    /**
     * Method to get value of {@link ComplexNumber#a}
     * 
     * @return double Real part
     */
    public double getA() {
        return a;
    }

    /**
     * Method to set new value for {@link ComplexNumber#a}
     * 
     * @param a - Real part
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Method to get value of {@link ComplexNumber#b}
     * 
     * @return double Image part
     */
    public double getB() {
        return b;
    }

    /**
     * Method to set new value for {@link ComplexNumber#b}
     * 
     * @param b - Image part
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Method prepares for short label of numbers
     * 
     * @param x - double number
     * @return String correct display value
     */
    private String numberToString(double x) {
        if (x == (int) x) {
            return Integer.toString((int) x);
        }
        return Double.toString(x);
    }

    @Override
    public String toString() {
        return String.format("(%s + %si)", this.numberToString(a), this.numberToString(b));
    }
}
