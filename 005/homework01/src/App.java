import java.util.ArrayList;
import java.util.List;
import Common.Angle3D;
import Common.Point3D;
import InMemoryModel.ModelStore;
import InMemoryModel.iModelChangeObserver;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.Poligon;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Texture;

public class App {
    public static void main(String[] args) throws Exception {
        Point3D alpha = new Point3D(25.4, 55.0, 13.6454);
        Point3D beta = new Point3D(15.54674, 30.0, 13.6454);
        Point3D gamma = new Point3D(2.6, 90.101, 145.4);

        List<Point3D> torso = new ArrayList<Point3D>();
        torso.add(alpha);
        torso.add(beta);
        torso.add(gamma);

        Poligon mesh = new Poligon(torso);
        List<Poligon> model1Poligons = new ArrayList<Poligon>();
        model1Poligons.add(mesh);
        List<Texture> model1Textures = new ArrayList<Texture>();
        model1Textures.add(new Texture());

        // Models
        PoligonalModel armor = new PoligonalModel(model1Poligons, model1Textures);
        List<PoligonalModel> models = new ArrayList<PoligonalModel>();
        models.add(armor);

        // Cameras
        Camera camera1 = new Camera(new Point3D(), new Angle3D());
        Camera camera2 = new Camera(new Point3D(), new Angle3D());
        List<Camera> cameras = new ArrayList<Camera>();
        cameras.add(camera1);
        cameras.add(camera2);

        // Flashes
        Flash flash1 = new Flash();
        Flash flash2 = new Flash();
        Flash flash3 = new Flash();
        List<Flash> flashes = new ArrayList<Flash>();
        flashes.add(flash1);
        flashes.add(flash2);
        flashes.add(flash3);

        // Scenes
        Scene schene1 = new Scene(models, flashes, cameras);
        Scene schene2 = new Scene(models, flashes, cameras);
        List<Scene> scenas = new ArrayList<Scene>();
        scenas.add(schene1);
        scenas.add(schene2);

        ModelStore store = new ModelStore(new ArrayList<iModelChangeObserver>());
        
    }
}
