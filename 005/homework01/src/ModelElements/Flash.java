package ModelElements;

import Common.Angle3D;
import Common.Color;
import Common.Point3D;

public class Flash {
    Point3D location;
    Angle3D angle;
    Color color;
    Float power;

    public Flash(Point3D point, Angle3D angle, Color hex, Float power) {
        this.location = point;
        this.angle = angle;
        this.color = hex;
        this.power = power;
    }

    public Flash() {
        this(new Point3D(), new Angle3D(), new Color(), (Float)0.00f);
    }

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D point) {
        this.location = point;
    }
}
