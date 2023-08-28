package ModelElements;

import java.util.List;

public class Scene {
    // public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public List<PoligonalModel> getModels() {
        return this.models;
    }

    public List<Flash> getFlashes() {
        return this.flashes;
    }

    public List<Camera> getCameras() {
        return this.cameras;
    }
}
