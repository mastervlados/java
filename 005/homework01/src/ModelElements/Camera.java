package ModelElements;

import Common.Angle3D;
import Common.Point3D;

public class Camera {
    public Point3D location;
    public Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D point) {
        this.location = point;
    }
}
